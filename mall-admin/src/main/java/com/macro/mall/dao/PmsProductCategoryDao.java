package com.macro.mall.dao;

import com.macro.mall.dto.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * 商品分類自定義Dao
 * Created by macro on 2018/5/25.
 */
public interface PmsProductCategoryDao {
    /**
     * 獲取商品分類及其子分類
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
