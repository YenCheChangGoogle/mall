package com.macro.mall.common.api;

/**
 * 常用API返回對像接口
 * Created by macro on 2019/4/19.
 */
public interface IErrorCode {
    /**
     * 返回碼
     */
    long getCode();

    /**
     * 返回信息
     */
    String getMessage();
}
