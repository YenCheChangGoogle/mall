package com.macro.mall.portal.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * 退貨申請請求參數
 * Created by macro on 2018/10/17.
 */
@Getter
@Setter
public class OmsOrderReturnApplyParam {
    @ApiModelProperty("訂單id")
    private Long orderId;
    @ApiModelProperty("退貨商品id")
    private Long productId;
    @ApiModelProperty("訂單編號")
    private String orderSn;
    @ApiModelProperty("會員用戶名")
    private String memberUsername;
    @ApiModelProperty("退貨人姓名")
    private String returnName;
    @ApiModelProperty("退貨人電話")
    private String returnPhone;
    @ApiModelProperty("商品圖片")
    private String productPic;
    @ApiModelProperty("商品名稱")
    private String productName;
    @ApiModelProperty("商品品牌")
    private String productBrand;
    @ApiModelProperty("商品銷售屬性：顏色：紅色；尺碼：xl;")
    private String productAttr;
    @ApiModelProperty("退貨數量")
    private Integer productCount;
    @ApiModelProperty("商品單價")
    private BigDecimal productPrice;
    @ApiModelProperty("商品實際支付單價")
    private BigDecimal productRealPrice;
    @ApiModelProperty("原因")
    private String reason;
    @ApiModelProperty("描述")
    private String description;
    @ApiModelProperty("憑證圖片，以逗號隔開")
    private String proofPics;

}
