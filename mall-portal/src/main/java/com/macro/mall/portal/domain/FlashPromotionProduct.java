package com.macro.mall.portal.domain;

import com.macro.mall.model.PmsProduct;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 秒殺信息和商品對像封裝
 * Created by macro on 2019/1/28.
 */
@Getter
@Setter
public class FlashPromotionProduct extends PmsProduct{
    //秒殺價格
    private BigDecimal flashPromotionPrice;
    //用於秒殺到數量
    private Integer flashPromotionCount;
    //秒殺限購數量
    private Integer flashPromotionLimit;
}
