package com.macro.mall.portal.service;

import com.macro.mall.model.OmsCartItem;
import com.macro.mall.portal.domain.CartProduct;
import com.macro.mall.portal.domain.CartPromotionItem;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 購物車管理Service
 * Created by macro on 2018/8/2.
 */
public interface OmsCartItemService {
    /**
     * 查詢購物車中是否包含該商品，有增加數量，無添加到購物車
     */
    @Transactional
    int add(OmsCartItem cartItem);

    /**
     * 根據會員編號獲取購物車列表
     */
    List<OmsCartItem> list(Long memberId);

    /**
     * 獲取包含促銷活動信息的購物車列表
     */
    List<CartPromotionItem> listPromotion(Long memberId, List<Long> cartIds);

    /**
     * 修改某個購物車商品的數量
     */
    int updateQuantity(Long id, Long memberId, Integer quantity);

    /**
     * 批量刪除購物車中的商品
     */
    int delete(Long memberId,List<Long> ids);

    /**
     *獲取購物車中用於選擇商品規格的商品信息
     */
    CartProduct getCartProduct(Long productId);

    /**
     * 修改購物車中商品的規格
     */
    @Transactional
    int updateAttr(OmsCartItem cartItem);

    /**
     * 清空購物車
     */
    int clear(Long memberId);
}
