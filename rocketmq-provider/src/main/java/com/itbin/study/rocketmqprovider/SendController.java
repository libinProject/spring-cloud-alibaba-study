package com.itbin.study.rocketmqprovider;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.apache.rocketmq.spring.support.RocketMQHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/10/26 16:48
 * @description:
 * @modified By:
 */
@RestController
public class SendController {

    @Autowired
    RocketMQTemplate rocketMQTemplate;

    @GetMapping("tx/send")
    public String send(String msg){
        rocketMQTemplate.sendMessageInTransaction("tx-topic",
                MessageBuilder.withPayload(msg)
                        .setHeader(RocketMQHeaders.TRANSACTION_ID, UUID.randomUUID().toString())
                        .setHeader("ContentID",UUID.randomUUID())
                        .build(),null);
        return "ok";
    }
}
