package com.macro.mall.dao;

import com.macro.mall.model.SmsCouponProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 優惠券和商品關係自定義Dao
 * Created by macro on 2018/8/28.
 */
public interface SmsCouponProductRelationDao {
    /**
     * 批量創建
     */
    int insertList(@Param("list")List<SmsCouponProductRelation> productRelationList);
}
