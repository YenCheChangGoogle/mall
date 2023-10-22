package com.macro.mall.portal.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;


/**
 * Jackson相關配置
 * 配置json不返回null的字段
 * Created by macro on 2018/8/2.
 */
@Configuration
public class JacksonConfig {
    @Bean
    @Primary
    @ConditionalOnMissingBean(ObjectMapper.class)
    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        ObjectMapper objectMapper = builder.createXmlMapper(false).build();

        // 通過該方法對mapper對像進行設置，所有序列化的對象都將按改規則進行系列化
        // Include.Include.ALWAYS 默認
        // Include.NON_DEFAULT 屬性為默認值不序列化
        // Include.NON_EMPTY 屬性為 空（""） 或者為 NULL 都不序列化，則返回的json是沒有這個字段的。這樣對移動端會更省流量
        // Include.NON_NULL 屬性為NULL 不序列化,就是為null的字段不參加序列化
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        // 字段保留，將null值轉為""
//        objectMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>()
//        {
//            @Override
//            public void serialize(Object o, JsonGenerator jsonGenerator,
//                                  SerializerProvider serializerProvider)
//                    throws IOException, JsonProcessingException
//            {
//                jsonGenerator.writeString("");
//            }
//        });
        return objectMapper;
    }
}
