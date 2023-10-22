package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 獲取OSS上傳文件授權返回結果
 * Created by macro on 2018/5/17.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OssPolicyResult {
    @ApiModelProperty("訪問身份驗證中用到用戶標識")
    private String accessKeyId;
    @ApiModelProperty("用戶表單上傳的策略,經過base64編碼過的字符串")
    private String policy;
    @ApiModelProperty("對policy簽名後的字符串")
    private String signature;
    @ApiModelProperty("上傳文件夾路徑前綴")
    private String dir;
    @ApiModelProperty("oss對外服務的訪問域名")
    private String host;
    @ApiModelProperty("上傳成功後的回調設置")
    private String callback;
}
