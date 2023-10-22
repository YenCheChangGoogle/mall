package com.macro.mall.service;

import com.macro.mall.model.SmsHomeNewProduct;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 首頁新品推薦管理Service
 * Created by macro on 2018/11/6.
 */
public interface SmsHomeNewProductService {
    /**
     * 添加首頁推薦
     */
    @Transactional
    int create(List<SmsHomeNewProduct> homeNewProductList);

    /**
     * 修改推薦排序
     */
    int updateSort(Long id, Integer sort);

    /**
     * 批量刪除推薦
     */
    int delete(List<Long> ids);

    /**
     * 批量更新推薦狀態
     */
    int updateRecommendStatus(List<Long> ids, Integer recommendStatus);

    /**
     * 分頁查詢推薦
     */
    List<SmsHomeNewProduct> list(String productName, Integer recommendStatus, Integer pageSize, Integer pageNum);
}
