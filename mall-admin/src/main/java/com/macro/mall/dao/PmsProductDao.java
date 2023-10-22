package com.macro.mall.dao;

import com.macro.mall.dto.PmsProductResult;
import org.apache.ibatis.annotations.Param;


/**
 * 商品管理自定義Dao
 * Created by macro on 2018/4/26.
 */
public interface PmsProductDao {
    /**
     * 獲取商品編輯信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
