package com.macro.mall.dao;

import com.macro.mall.model.UmsAdminRoleRelation;
import com.macro.mall.model.UmsResource;
import com.macro.mall.model.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 後台用戶與角色關係管理自定義Dao
 * Created by macro on 2018/10/8.
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 批量插入用戶角色關係
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * 獲取用於所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * 獲取用戶所有可訪問資源
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);

    /**
     * 獲取資源相關用戶ID列表
     */
    List<Long> getAdminIdList(@Param("resourceId") Long resourceId);
}
