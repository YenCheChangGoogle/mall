package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 訂單退貨申請查詢參數
 * Created by macro on 2018/10/18.
 */
@Getter
@Setter
public class OmsReturnApplyQueryParam {
    @ApiModelProperty("服務單號")
    private Long id;
    @ApiModelProperty(value = "收貨人姓名/號碼")
    private String receiverKeyword;
    @ApiModelProperty(value = "申請狀態：0->待處理；1->退貨中；2->已完成；3->已拒絕")
    private Integer status;
    @ApiModelProperty(value = "申請時間")
    private String createTime;
    @ApiModelProperty(value = "處理人員")
    private String handleMan;
    @ApiModelProperty(value = "處理時間")
    private String handleTime;
}
