package com.macro.mall.service;

import com.macro.mall.dto.UmsAdminParam;
import com.macro.mall.dto.UpdateAdminPasswordParam;
import com.macro.mall.model.UmsAdmin;
import com.macro.mall.model.UmsResource;
import com.macro.mall.model.UmsRole;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 後台用戶管理Service
 * Created by macro on 2018/4/26.
 */
public interface UmsAdminService {
    /**
     * 根據用戶名獲取後台管理員
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 註冊功能
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);

    /**
     * 登錄功能
     * @param username 用戶名
     * @param password 密碼
     * @return 生成的JWT的token
     */
    String login(String username,String password);

    /**
     * 刷新token的功能
     * @param oldToken 舊的token
     */
    String refreshToken(String oldToken);

    /**
     * 根據用戶id獲取用戶
     */
    UmsAdmin getItem(Long id);

    /**
     * 根據用戶名或暱稱分頁查詢用戶
     */
    List<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 修改指定用戶信息
     */
    int update(Long id, UmsAdmin admin);

    /**
     * 刪除指定用戶
     */
    int delete(Long id);

    /**
     * 修改用戶角色關係
     */
    @Transactional
    int updateRole(Long adminId, List<Long> roleIds);

    /**
     * 獲取用戶對應角色
     */
    List<UmsRole> getRoleList(Long adminId);

    /**
     * 獲取指定用戶的可訪問資源
     */
    List<UmsResource> getResourceList(Long adminId);

    /**
     * 修改密碼
     */
    int updatePassword(UpdateAdminPasswordParam updatePasswordParam);

    /**
     * 獲取用戶信息
     */
    UserDetails loadUserByUsername(String username);
}
