package com.macro.mall.service;

import com.macro.mall.model.UmsResourceCategory;

import java.util.List;

/**
 * 後台資源分類管理Service
 * Created by macro on 2020/2/5.
 */
public interface UmsResourceCategoryService {

    /**
     * 獲取所有資源分類
     */
    List<UmsResourceCategory> listAll();

    /**
     * 創建資源分類
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * 修改資源分類
     */
    int update(Long id, UmsResourceCategory umsResourceCategory);

    /**
     * 刪除資源分類
     */
    int delete(Long id);
}
