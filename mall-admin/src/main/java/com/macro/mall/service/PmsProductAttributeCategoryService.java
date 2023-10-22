package com.macro.mall.service;

import com.macro.mall.dto.PmsProductAttributeCategoryItem;
import com.macro.mall.model.PmsProductAttributeCategory;

import java.util.List;

/**
 * 商品屬性分類管理Service
 * Created by macro on 2018/4/26.
 */
public interface PmsProductAttributeCategoryService {
    /**
     * 創建屬性分類
     */
    int create(String name);

    /**
     * 修改屬性分類
     */
    int update(Long id, String name);

    /**
     * 刪除屬性分類
     */
    int delete(Long id);

    /**
     * 獲取屬性分類詳情
     */
    PmsProductAttributeCategory getItem(Long id);

    /**
     * 分頁查詢屬性分類
     */
    List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum);

    /**
     * 獲取包含屬性的屬性分類
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
