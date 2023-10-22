package com.macro.mall.service;

import com.macro.mall.dto.*;
import com.macro.mall.model.OmsOrder;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 訂單管理Service
 * Created by macro on 2018/10/11.
 */
public interface OmsOrderService {
    /**
     * 訂單查詢
     */
    List<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量發貨
     */
    @Transactional
    int delivery(List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 批量關閉訂單
     */
    @Transactional
    int close(List<Long> ids, String note);

    /**
     * 批量刪除訂單
     */
    int delete(List<Long> ids);

    /**
     * 獲取指定訂單詳情
     */
    OmsOrderDetail detail(Long id);

    /**
     * 修改訂單收貨人信息
     */
    @Transactional
    int updateReceiverInfo(OmsReceiverInfoParam receiverInfoParam);

    /**
     * 修改訂單費用信息
     */
    @Transactional
    int updateMoneyInfo(OmsMoneyInfoParam moneyInfoParam);

    /**
     * 修改訂單備註
     */
    @Transactional
    int updateNote(Long id, String note, Integer status);
}
