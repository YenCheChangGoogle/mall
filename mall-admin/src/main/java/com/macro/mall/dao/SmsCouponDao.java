package com.macro.mall.dao;

import com.macro.mall.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;

/**
 * 優惠券管理自定義Dao
 * Created by macro on 2018/8/29.
 */
public interface SmsCouponDao {
    /**
     * 獲取優惠券詳情包括綁定關係
     */
    SmsCouponParam getItem(@Param("id") Long id);
}
