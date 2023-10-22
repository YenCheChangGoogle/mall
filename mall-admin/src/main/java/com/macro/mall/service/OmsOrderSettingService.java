package com.macro.mall.service;

import com.macro.mall.model.OmsOrderSetting;

/**
 * 訂單設置管理Service
 * Created by macro on 2018/10/16.
 */
public interface OmsOrderSettingService {
    /**
     * 獲取指定訂單設置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定訂單設置
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
