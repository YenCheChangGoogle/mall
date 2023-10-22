package com.macro.mall.service;

import com.macro.mall.dto.OssCallbackResult;
import com.macro.mall.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * Oss對像存儲管理Service
 * Created by macro on 2018/5/17.
 */
public interface OssService {
    /**
     * Oss上傳策略生成
     */
    OssPolicyResult policy();
    /**
     * Oss上傳成功回調
     */
    OssCallbackResult callback(HttpServletRequest request);
}
