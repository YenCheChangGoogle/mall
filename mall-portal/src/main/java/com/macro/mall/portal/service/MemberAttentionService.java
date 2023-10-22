package com.macro.mall.portal.service;

import com.macro.mall.portal.domain.MemberBrandAttention;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 會員品牌關注管理Service
 * Created by macro on 2018/8/2.
 */
public interface MemberAttentionService {
    /**
     * 添加關注
     */
    int add(MemberBrandAttention memberBrandAttention);

    /**
     * 取消關注
     */
    int delete(Long brandId);

    /**
     * 獲取用戶關注列表
     */
    Page<MemberBrandAttention> list(Integer pageNum, Integer pageSize);

    /**
     * 獲取用戶關注詳情
     */
    MemberBrandAttention detail(Long brandId);

    /**
     * 清空關注列表
     */
    void clear();
}
