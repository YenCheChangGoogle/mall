package com.macro.mall.portal.service;

import com.macro.mall.model.OmsCartItem;
import com.macro.mall.portal.domain.CartPromotionItem;

import java.util.List;

/**
 * 促銷管理Service
 * Created by macro on 2018/8/27.
 */
public interface OmsPromotionService {
    /**
     * 計算購物車中的促銷活動信息
     * @param cartItemList 購物車
     */
    List<CartPromotionItem> calcCartPromotion(List<OmsCartItem> cartItemList);
}
