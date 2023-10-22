package com.macro.mall.dto;

import com.macro.mall.model.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 創建和修改商品的請求參數
 * Created by macro on 2018/4/26.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsProductParam extends PmsProduct{
    @ApiModelProperty("商品階梯價格設置")
    private List<PmsProductLadder> productLadderList;
    @ApiModelProperty("商品滿減價格設置")
    private List<PmsProductFullReduction> productFullReductionList;
    @ApiModelProperty("商品會員價格設置")
    private List<PmsMemberPrice> memberPriceList;
    @ApiModelProperty("商品的sku庫存信息")
    private List<PmsSkuStock> skuStockList;
    @ApiModelProperty("商品參數及自定義規格屬性")
    private List<PmsProductAttributeValue> productAttributeValueList;
    @ApiModelProperty("專題和商品關係")
    private List<CmsSubjectProductRelation> subjectProductRelationList;
    @ApiModelProperty("優選專區和商品的關係")
    private List<CmsPrefrenceAreaProductRelation> prefrenceAreaProductRelationList;
}
