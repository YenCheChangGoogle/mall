package com.macro.mall.common.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Controller層的日誌封裝類
 * Created by macro on 2018/4/26.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class WebLog {
    /**
     * 操作描述
     */
    private String description;

    /**
     * 操作用戶
     */
    private String username;

    /**
     * 操作時間
     */
    private Long startTime;

    /**
     * 消耗時間
     */
    private Integer spendTime;

    /**
     * 根路徑
     */
    private String basePath;

    /**
     * URI
     */
    private String uri;

    /**
     * URL
     */
    private String url;

    /**
     * 請求類型
     */
    private String method;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 請求參數
     */
    private Object parameter;

    /**
     * 返回結果
     */
    private Object result;

}
