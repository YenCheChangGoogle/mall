package com.macro.mall.service;

import com.macro.mall.dto.SmsCouponParam;
import com.macro.mall.model.SmsCoupon;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 優惠券管理Service
 * Created by macro on 2018/8/28.
 */
public interface SmsCouponService {
    /**
     * 添加優惠券
     */
    @Transactional
    int create(SmsCouponParam couponParam);

    /**
     * 根據優惠券id刪除優惠券
     */
    @Transactional
    int delete(Long id);

    /**
     * 根據優惠券id更新優惠券信息
     */
    @Transactional
    int update(Long id, SmsCouponParam couponParam);

    /**
     * 分頁獲取優惠券列表
     */
    List<SmsCoupon> list(String name, Integer type, Integer pageSize, Integer pageNum);

    /**
     * 獲取優惠券詳情
     * @param id 優惠券表id
     */
    SmsCouponParam getItem(Long id);
}
