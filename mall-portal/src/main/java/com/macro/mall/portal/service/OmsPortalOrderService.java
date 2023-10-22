package com.macro.mall.portal.service;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.portal.domain.ConfirmOrderResult;
import com.macro.mall.portal.domain.OmsOrderDetail;
import com.macro.mall.portal.domain.OrderParam;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 前台訂單管理Service
 * Created by macro on 2018/8/30.
 */
public interface OmsPortalOrderService {
    /**
     * 根據用戶購物車信息生成確認單信息
     * @param cartIds
     */
    ConfirmOrderResult generateConfirmOrder(List<Long> cartIds);

    /**
     * 根據提交信息生成訂單
     */
    @Transactional
    Map<String, Object> generateOrder(OrderParam orderParam);

    /**
     * 支付成功後的回調
     */
    @Transactional
    Integer paySuccess(Long orderId, Integer payType);

    /**
     * 自動取消超時訂單
     */
    @Transactional
    Integer cancelTimeOutOrder();

    /**
     * 取消單個超時訂單
     */
    @Transactional
    void cancelOrder(Long orderId);

    /**
     * 發送延遲消息取消訂單
     */
    void sendDelayMessageCancelOrder(Long orderId);

    /**
     * 確認收貨
     */
    void confirmReceiveOrder(Long orderId);

    /**
     * 分頁獲取用戶訂單
     */
    CommonPage<OmsOrderDetail> list(Integer status, Integer pageNum, Integer pageSize);

    /**
     * 根據訂單ID獲取訂單詳情
     */
    OmsOrderDetail detail(Long orderId);

    /**
     * 用戶根據訂單ID刪除訂單
     */
    void deleteOrder(Long orderId);
}
