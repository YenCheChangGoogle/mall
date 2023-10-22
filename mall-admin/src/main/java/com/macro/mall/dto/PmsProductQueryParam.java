package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商品查詢參數
 * Created by macro on 2018/4/27.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsProductQueryParam {
    @ApiModelProperty("上架狀態")
    private Integer publishStatus;
    @ApiModelProperty("審核狀態")
    private Integer verifyStatus;
    @ApiModelProperty("商品名稱模糊關鍵字")
    private String keyword;
    @ApiModelProperty("商品貨號")
    private String productSn;
    @ApiModelProperty("商品分類編號")
    private Long productCategoryId;
    @ApiModelProperty("商品品牌編號")
    private Long brandId;
}
