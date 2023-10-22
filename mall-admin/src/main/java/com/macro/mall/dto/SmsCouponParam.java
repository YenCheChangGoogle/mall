package com.macro.mall.dto;

import com.macro.mall.model.SmsCoupon;
import com.macro.mall.model.SmsCouponProductCategoryRelation;
import com.macro.mall.model.SmsCouponProductRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 優惠券信息封裝，包括綁定商品和分類
 * Created by macro on 2018/8/28.
 */
public class SmsCouponParam extends SmsCoupon {
    @Getter
    @Setter
    @ApiModelProperty("優惠券綁定的商品")
    private List<SmsCouponProductRelation> productRelationList;
    @Getter
    @Setter
    @ApiModelProperty("優惠券綁定的商品分類")
    private List<SmsCouponProductCategoryRelation> productCategoryRelationList;
}
