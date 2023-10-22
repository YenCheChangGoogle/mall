package com.macro.mall.dao;

import com.macro.mall.model.PmsProductFullReduction;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品滿減自定義Dao
 * Created by macro on 2018/4/26.
 */
public interface PmsProductFullReductionDao {
    /**
     * 批量創建
     */
    int insertList(@Param("list") List<PmsProductFullReduction> productFullReductionList);
}
