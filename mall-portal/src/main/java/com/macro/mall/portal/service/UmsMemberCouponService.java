package com.macro.mall.portal.service;

import com.macro.mall.model.SmsCoupon;
import com.macro.mall.model.SmsCouponHistory;
import com.macro.mall.portal.domain.CartPromotionItem;
import com.macro.mall.portal.domain.SmsCouponHistoryDetail;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用戶優惠券管理Service
 * Created by macro on 2018/8/29.
 */
public interface UmsMemberCouponService {
    /**
     * 會員添加優惠券
     */
    @Transactional
    void add(Long couponId);

    /**
     * 獲取優惠券歷史列表
     */
    List<SmsCouponHistory> listHistory(Integer useStatus);

    /**
     * 根據購物車信息獲取可用優惠券
     */
    List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList, Integer type);

    /**
     * 獲取當前商品相關優惠券
     */
    List<SmsCoupon> listByProduct(Long productId);

    /**
     * 獲取用戶優惠券列表
     */
    List<SmsCoupon> list(Integer useStatus);
}
