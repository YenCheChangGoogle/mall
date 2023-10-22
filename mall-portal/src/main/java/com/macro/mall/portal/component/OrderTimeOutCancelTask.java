package com.macro.mall.portal.component;

import com.macro.mall.portal.service.OmsPortalOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 取消超時訂單並解鎖庫存的定時器
 * Created by macro on 2018/8/24.
 */
@Component
public class OrderTimeOutCancelTask {
    private Logger LOGGER =LoggerFactory.getLogger(OrderTimeOutCancelTask.class);
    @Autowired
    private OmsPortalOrderService portalOrderService;

    /**
     * cron表達式：Seconds Minutes Hours DayofMonth Month DayofWeek [Year]
     * 每10分鐘掃瞄一次，掃瞄超時未支付訂單，進行取消操作
     */
    @Scheduled(cron = "0 0/10 * ? * ?")
    private void cancelTimeOutOrder(){
        Integer count = portalOrderService.cancelTimeOutOrder();
        LOGGER.info("取消訂單，並根據sku編號釋放鎖定庫存，取消訂單數量：{}",count);
    }
}
