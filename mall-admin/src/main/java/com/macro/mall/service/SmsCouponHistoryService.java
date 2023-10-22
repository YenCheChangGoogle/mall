package com.macro.mall.service;

import com.macro.mall.model.SmsCouponHistory;

import java.util.List;

/**
 * 優惠券領取記錄管理Service
 * Created by macro on 2018/11/6.
 */
public interface SmsCouponHistoryService {
    /**
     * 分頁查詢優惠券領取記錄
     * @param couponId 優惠券id
     * @param useStatus 使用狀態
     * @param orderSn 使用訂單號碼
     */
    List<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum);
}
