package com.macro.mall.portal.service;

import com.macro.mall.model.UmsMember;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

/**
 * 會員管理Service
 * Created by macro on 2018/8/3.
 */
public interface UmsMemberService {
    /**
     * 根據用戶名獲取會員
     */
    UmsMember getByUsername(String username);

    /**
     * 根據會員編號獲取會員
     */
    UmsMember getById(Long id);

    /**
     * 用戶註冊
     */
    @Transactional
    void register(String username, String password, String telephone, String authCode);

    /**
     * 生成驗證碼
     */
    String generateAuthCode(String telephone);

    /**
     * 修改密碼
     */
    @Transactional
    void updatePassword(String telephone, String password, String authCode);

    /**
     * 獲取當前登錄會員
     */
    UmsMember getCurrentMember();

    /**
     * 根據會員id修改會員積分
     */
    void updateIntegration(Long id,Integer integration);


    /**
     * 獲取用戶信息
     */
    UserDetails loadUserByUsername(String username);

    /**
     * 登錄後獲取token
     */
    String login(String username, String password);

    /**
     * 刷新token
     */
    String refreshToken(String token);
}
