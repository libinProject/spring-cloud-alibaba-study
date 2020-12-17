package com.itbin.study.streamconsumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/10/27 18:22
 * @description:
 * @modified By:
 */
public interface MySource {

    @Input("input1")
    SubscribableChannel input1();
}
