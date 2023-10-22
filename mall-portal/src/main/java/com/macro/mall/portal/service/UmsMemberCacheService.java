package com.macro.mall.portal.service;

import com.macro.mall.model.UmsMember;

/**
 * 會員信息緩存業務類
 * Created by macro on 2020/3/14.
 */
public interface UmsMemberCacheService {
    /**
     * 刪除會員用戶緩存
     */
    void delMember(Long memberId);

    /**
     * 獲取會員用戶緩存
     */
    UmsMember getMember(String username);

    /**
     * 設置會員用戶緩存
     */
    void setMember(UmsMember member);

    /**
     * 設置驗證碼
     */
    void setAuthCode(String telephone, String authCode);

    /**
     * 獲取驗證碼
     */
    String getAuthCode(String telephone);
}
