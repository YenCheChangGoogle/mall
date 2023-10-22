package com.macro.mall.common.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Swagger自定義配置
 * Created by macro on 2020/7/16.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
public class SwaggerProperties {
    /**
     * API文檔生成基礎路徑
     */
    private String apiBasePackage;
    /**
     * 是否要啟用登錄認證
     */
    private boolean enableSecurity;
    /**
     * 文檔標題
     */
    private String title;
    /**
     * 文檔描述
     */
    private String description;
    /**
     * 文檔版本
     */
    private String version;
    /**
     * 文檔聯繫人姓名
     */
    private String contactName;
    /**
     * 文檔聯繫人網址
     */
    private String contactUrl;
    /**
     * 文檔聯繫人郵箱
     */
    private String contactEmail;
}
