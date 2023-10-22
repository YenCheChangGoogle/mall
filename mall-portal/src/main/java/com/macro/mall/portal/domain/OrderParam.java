package com.macro.mall.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 生成訂單時傳入的參數
 * Created by macro on 2018/8/30.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderParam {
    @ApiModelProperty("收貨地址ID")
    private Long memberReceiveAddressId;
    @ApiModelProperty("優惠券ID")
    private Long couponId;
    @ApiModelProperty("使用的積分數")
    private Integer useIntegration;
    @ApiModelProperty("支付方式")
    private Integer payType;
    @ApiModelProperty("被選中的購物車商品ID")
    private List<Long> cartIds;
}
