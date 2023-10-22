package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 修改訂單費用信息參數
 * Created by macro on 2018/10/29.
 */
@Getter
@Setter
public class OmsMoneyInfoParam {
    @ApiModelProperty("訂單ID")
    private Long orderId;
    @ApiModelProperty("運費金額")
    private BigDecimal freightAmount;
    @ApiModelProperty("管理員後台調整訂單所使用的折扣金額")
    private BigDecimal discountAmount;
    @ApiModelProperty("訂單狀態：0->待付款；1->待發貨；2->已發貨；3->已完成；4->已關閉；5->無效訂單")
    private Integer status;
}
