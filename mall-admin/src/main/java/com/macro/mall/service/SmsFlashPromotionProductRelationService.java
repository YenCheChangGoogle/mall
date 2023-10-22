package com.macro.mall.service;

import com.macro.mall.dto.SmsFlashPromotionProduct;
import com.macro.mall.model.SmsFlashPromotionProductRelation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 限時購商品關聯管理Service
 * Created by macro on 2018/11/16.
 */
public interface SmsFlashPromotionProductRelationService {
    /**
     * 批量添加關聯
     */
    @Transactional
    int create(List<SmsFlashPromotionProductRelation> relationList);

    /**
     * 修改關聯信息
     */
    int update(Long id, SmsFlashPromotionProductRelation relation);

    /**
     * 刪除關聯
     */
    int delete(Long id);

    /**
     * 獲取關聯詳情
     */
    SmsFlashPromotionProductRelation getItem(Long id);

    /**
     * 分頁查詢相關商品及限時購促銷信息
     *
     * @param flashPromotionId        限時購id
     * @param flashPromotionSessionId 限時購場次id
     */
    List<SmsFlashPromotionProduct> list(Long flashPromotionId, Long flashPromotionSessionId, Integer pageSize, Integer pageNum);

    /**
     * 根據活動和場次id獲取商品關係數量
     * @param flashPromotionId        限時購id
     * @param flashPromotionSessionId 限時購場次id
     */
    long getCount(Long flashPromotionId,Long flashPromotionSessionId);
}
