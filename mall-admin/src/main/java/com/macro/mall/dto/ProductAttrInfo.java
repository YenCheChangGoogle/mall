package com.macro.mall.dto;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商品分類對應屬性信息
 * Created by macro on 2018/5/23.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ProductAttrInfo {
    @ApiModelProperty("商品屬性ID")
    private Long attributeId;
    @ApiModelProperty("商品屬性分類ID")
    private Long attributeCategoryId;
}
