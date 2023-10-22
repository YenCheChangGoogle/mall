package com.macro.mall.service;

import com.macro.mall.model.UmsResource;

import java.util.List;

/**
 * 後台資源管理Service
 * Created by macro on 2020/2/2.
 */
public interface UmsResourceService {
    /**
     * 添加資源
     */
    int create(UmsResource umsResource);

    /**
     * 修改資源
     */
    int update(Long id, UmsResource umsResource);

    /**
     * 獲取資源詳情
     */
    UmsResource getItem(Long id);

    /**
     * 刪除資源
     */
    int delete(Long id);

    /**
     * 分頁查詢資源
     */
    List<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum);

    /**
     * 查詢全部資源
     */
    List<UmsResource> listAll();
}
