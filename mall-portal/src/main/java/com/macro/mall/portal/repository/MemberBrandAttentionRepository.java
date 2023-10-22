package com.macro.mall.portal.repository;

import com.macro.mall.portal.domain.MemberBrandAttention;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 會員品牌關注Repository
 * Created by macro on 2018/8/2.
 */
public interface MemberBrandAttentionRepository extends MongoRepository<MemberBrandAttention, String> {
    /**
     * 根據會員ID和品牌ID查找記錄
     */
    MemberBrandAttention findByMemberIdAndBrandId(Long memberId, Long brandId);

    /**
     * 根據會員ID和品牌ID刪除記錄
     */
    int deleteByMemberIdAndBrandId(Long memberId, Long brandId);

    /**
     * 根據會員ID分頁查找記錄
     */
    Page<MemberBrandAttention> findByMemberId(Long memberId, Pageable pageable);

    /**
     * 根據會員ID刪除記錄
     */
    void deleteAllByMemberId(Long memberId);
}
