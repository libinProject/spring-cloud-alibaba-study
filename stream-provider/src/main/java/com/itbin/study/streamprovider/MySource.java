package com.itbin.study.streamprovider;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/10/27 18:18
 * @description:
 * @modified By:
 */
@Component
public interface MySource {

    @Output("output1")
    MessageChannel output1();
}
