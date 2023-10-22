package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * OSS上傳成功後的回調參數
 * Created by macro on 2018/5/17.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OssCallbackParam {
    @ApiModelProperty("請求的回調地址")
    private String callbackUrl;
    @ApiModelProperty("回調是傳入request中的參數")
    private String callbackBody;
    @ApiModelProperty("回調時傳入參數的格式，比如表單提交形式")
    private String callbackBodyType;
}
