package com.macro.mall.dao;

import com.macro.mall.dto.PmsProductAttributeCategoryItem;

import java.util.List;

/**
 * 商品屬性分類管理自定義Dao
 * Created by macro on 2018/5/24.
 */
public interface PmsProductAttributeCategoryDao {
    /**
     * 獲取包含屬性的商品屬性分類
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
