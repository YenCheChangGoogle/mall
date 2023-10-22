package com.macro.mall.dao;

import com.macro.mall.dto.OmsOrderDeliveryParam;
import com.macro.mall.dto.OmsOrderDetail;
import com.macro.mall.dto.OmsOrderQueryParam;
import com.macro.mall.model.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 訂單查詢自定義Dao
 * Created by macro on 2018/10/12.
 */
public interface OmsOrderDao {
    /**
     * 條件查詢訂單
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量發貨
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 獲取訂單詳情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);
}
