package com.macro.mall.portal.repository;

import com.macro.mall.portal.domain.MemberProductCollection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 會員商品收藏Repository
 * Created by macro on 2018/8/2.
 */
public interface MemberProductCollectionRepository extends MongoRepository<MemberProductCollection, String> {
    /**
     * 根據會員ID和商品ID查找記錄
     */
    MemberProductCollection findByMemberIdAndProductId(Long memberId, Long productId);

    /**
     * 根據會員ID和商品ID刪除記錄
     */
    int deleteByMemberIdAndProductId(Long memberId, Long productId);

    /**
     * 根據會員ID分頁查詢記錄
     */
    Page<MemberProductCollection> findByMemberId(Long memberId, Pageable pageable);

    /**
     * 根據會員ID刪除錄
     */
    void deleteAllByMemberId(Long memberId);
}
