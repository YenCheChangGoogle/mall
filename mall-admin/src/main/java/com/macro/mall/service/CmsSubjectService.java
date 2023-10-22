package com.macro.mall.service;

import com.macro.mall.model.CmsSubject;

import java.util.List;

/**
 * 商品專題管理Service
 * Created by macro on 2018/6/1.
 */
public interface CmsSubjectService {
    /**
     * 查詢所有專題
     */
    List<CmsSubject> listAll();

    /**
     * 分頁查詢專題
     */
    List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize);
}
