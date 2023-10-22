package com.macro.mall.search.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * 搜索商品的屬性信息
 * Created by macro on 2018/6/27.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EsProductAttributeValue implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long productAttributeId;
    //屬性值
    @Field(type = FieldType.Keyword)
    private String value;
    //屬性參數：0->規格；1->參數
    private Integer type;
    //屬性名稱
    @Field(type=FieldType.Keyword)
    private String name;
}
