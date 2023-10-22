package com.macro.mall.search.service;

import com.macro.mall.search.domain.EsProduct;
import com.macro.mall.search.domain.EsProductRelatedInfo;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 搜索商品管理Service
 * Created by macro on 2018/6/19.
 */
public interface EsProductService {
    /**
     * 從數據庫中導入所有商品到ES
     */
    int importAll();

    /**
     * 根據id刪除商品
     */
    void delete(Long id);

    /**
     * 根據id創建商品
     */
    EsProduct create(Long id);

    /**
     * 批量刪除商品
     */
    void delete(List<Long> ids);

    /**
     * 根據關鍵字搜索名稱或者副標題
     */
    Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize);

    /**
     * 根據關鍵字搜索名稱或者副標題復合查詢
     */
    Page<EsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize,Integer sort);

    /**
     * 根據商品id推薦相關商品
     */
    Page<EsProduct> recommend(Long id, Integer pageNum, Integer pageSize);

    /**
     * 獲取搜索詞相關品牌、分類、屬性
     */
    EsProductRelatedInfo searchRelatedInfo(String keyword);
}
