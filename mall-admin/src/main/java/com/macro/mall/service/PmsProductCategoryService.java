package com.macro.mall.service;

import com.macro.mall.dto.PmsProductCategoryParam;
import com.macro.mall.dto.PmsProductCategoryWithChildrenItem;
import com.macro.mall.model.PmsProductCategory;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品分類管理Service
 * Created by macro on 2018/4/26.
 */
public interface PmsProductCategoryService {
    /**
     * 創建商品分類
     */
    @Transactional
    int create(PmsProductCategoryParam pmsProductCategoryParam);

    /**
     * 修改商品分類
     */
    @Transactional
    int update(Long id, PmsProductCategoryParam pmsProductCategoryParam);

    /**
     * 分頁獲取商品分類
     */
    List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 刪除商品分類
     */
    int delete(Long id);

    /**
     * 根據ID獲取商品分類
     */
    PmsProductCategory getItem(Long id);

    /**
     * 批量修改導航狀態
     */
    int updateNavStatus(List<Long> ids, Integer navStatus);

    /**
     * 批量修改顯示狀態
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 以層級形式獲取商品分類
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
