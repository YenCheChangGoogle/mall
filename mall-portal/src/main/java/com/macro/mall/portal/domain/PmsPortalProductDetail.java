package com.macro.mall.portal.domain;

import com.macro.mall.model.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 前台商品詳情
 * Created by macro on 2020/4/6.
 */
@Getter
@Setter
public class PmsPortalProductDetail{
    @ApiModelProperty("商品信息")
    private PmsProduct product;
    @ApiModelProperty("商品品牌")
    private PmsBrand brand;
    @ApiModelProperty("商品屬性與參數")
    private List<PmsProductAttribute> productAttributeList;
    @ApiModelProperty("手動錄入的商品屬性與參數值")
    private List<PmsProductAttributeValue> productAttributeValueList;
    @ApiModelProperty("商品的sku庫存信息")
    private List<PmsSkuStock> skuStockList;
    @ApiModelProperty("商品階梯價格設置")
    private List<PmsProductLadder> productLadderList;
    @ApiModelProperty("商品滿減價格設置")
    private List<PmsProductFullReduction> productFullReductionList;
    @ApiModelProperty("商品可用優惠券")
    private List<SmsCoupon> couponList;
}
