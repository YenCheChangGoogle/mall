package com.macro.mall.service;

import com.macro.mall.dto.UmsMenuNode;
import com.macro.mall.model.UmsMenu;

import java.util.List;

/**
 * 後台菜單管理Service
 * Created by macro on 2020/2/2.
 */
public interface UmsMenuService {
    /**
     * 創建後台菜單
     */
    int create(UmsMenu umsMenu);

    /**
     * 修改後台菜單
     */
    int update(Long id, UmsMenu umsMenu);

    /**
     * 根據ID獲取菜單詳情
     */
    UmsMenu getItem(Long id);

    /**
     * 根據ID刪除菜單
     */
    int delete(Long id);

    /**
     * 分頁查詢後台菜單
     */
    List<UmsMenu> list(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 樹形結構返回所有菜單列表
     */
    List<UmsMenuNode> treeList();

    /**
     * 修改菜單顯示狀態
     */
    int updateHidden(Long id, Integer hidden);
}
