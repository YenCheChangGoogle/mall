package com.macro.mall.portal.dao;

import com.macro.mall.model.SmsCoupon;
import com.macro.mall.portal.domain.CartProduct;
import com.macro.mall.portal.domain.PromotionProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 前台購物車商品管理自定義Dao
 * Created by macro on 2018/8/2.
 */
public interface PortalProductDao {
    /**
     * 獲取購物車商品信息
     */
    CartProduct getCartProduct(@Param("id") Long id);

    /**
     * 獲取促銷商品信息列表
     */
    List<PromotionProduct> getPromotionProductList(@Param("ids") List<Long> ids);

    /**
     * 獲取可用優惠券列表
     */
    List<SmsCoupon> getAvailableCouponList(@Param("productId") Long productId, @Param("productCategoryId") Long productCategoryId);
}
