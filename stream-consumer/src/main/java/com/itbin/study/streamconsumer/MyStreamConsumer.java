package com.itbin.study.streamconsumer;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/10/27 17:26
 * @description:
 * @modified By:
 */
@Service
public class MyStreamConsumer {

    @StreamListener("input1")
    public void receive(String msg) {
        System.out.println("stream msg receive:" + msg);
    }
}
