package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 訂單查詢參數
 * Created by macro on 2018/10/11.
 */
@Getter
@Setter
public class OmsOrderQueryParam {
    @ApiModelProperty(value = "訂單編號")
    private String orderSn;
    @ApiModelProperty(value = "收貨人姓名/號碼")
    private String receiverKeyword;
    @ApiModelProperty(value = "訂單狀態：0->待付款；1->待發貨；2->已發貨；3->已完成；4->已關閉；5->無效訂單")
    private Integer status;
    @ApiModelProperty(value = "訂單類型：0->正常訂單；1->秒殺訂單")
    private Integer orderType;
    @ApiModelProperty(value = "訂單來源：0->PC訂單；1->app訂單")
    private Integer sourceType;
    @ApiModelProperty(value = "訂單提交時間")
    private String createTime;
}
