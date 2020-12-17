package com.itbin.study.sleuthconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/2/25 10:55
 * @description:
 * @modified By:
 */
@EnableFeignClients(basePackages = "com.itbin.study.sleuthconsumer.feign")
@SpringBootApplication
public class SleuthConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthConsumerApplication.class, args);
    }

}
