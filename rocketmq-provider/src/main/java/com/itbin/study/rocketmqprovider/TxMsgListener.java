package com.itbin.study.rocketmqprovider;

import org.apache.rocketmq.spring.annotation.RocketMQTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQLocalTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQLocalTransactionState;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/10/26 17:29
 * @description:
 * @modified By:
 */
@Component
@RocketMQTransactionListener
public class TxMsgListener implements RocketMQLocalTransactionListener {
    @Override
    public RocketMQLocalTransactionState executeLocalTransaction(Message message, Object o) {
        System.out.println("executeLocalTransaction ..." + System.currentTimeMillis());

        RocketMQLocalTransactionState state = RocketMQLocalTransactionState.ROLLBACK;
        try {
            //int i = 1 / 0;

            Thread.sleep(60 * 1000);
            state = RocketMQLocalTransactionState.COMMIT;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("executeLocalTransaction return :" + state);
        return state;
    }

    @Override
    public RocketMQLocalTransactionState checkLocalTransaction(Message message) {
        System.out.println("checkLocalTransaction ...");
        return RocketMQLocalTransactionState.COMMIT;
    }
}
