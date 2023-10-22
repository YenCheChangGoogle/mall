package com.macro.mall.dao;

import com.macro.mall.model.PmsProductAttributeValue;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品參數/規格屬性自定義Dao
 * Created by macro on 2018/4/26.
 */
public interface PmsProductAttributeValueDao {
    /**
     * 批量創建
     */
    int insertList(@Param("list")List<PmsProductAttributeValue> productAttributeValueList);
}
