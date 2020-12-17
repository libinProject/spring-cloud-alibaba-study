package com.itbin.study.rocketmqconsumer;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/10/26 15:56
 * @description:
 * @modified By:
 */
@Service
@RocketMQMessageListener(topic = "tx-topic", consumerGroup = "tx-consumer")
public class MyTxConsumerMq implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("msg receive:" + s);
    }
}
