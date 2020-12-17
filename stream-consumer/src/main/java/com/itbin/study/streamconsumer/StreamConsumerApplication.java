package com.itbin.study.streamconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/2/25 10:55
 * @description:
 * @modified By:
 */
@SpringBootApplication
@EnableBinding({MySource.class})
public class StreamConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumerApplication.class, args);
    }

}
