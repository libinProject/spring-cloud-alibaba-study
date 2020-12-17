package com.itbin.study.sleuthconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/9 16:59
 * @description:
 * @modified By:
 */
@Component
@FeignClient(name = "sleuth-provider", url = "localhost:8881")
public interface SleuthServiceFeign {

    /**
     * feign调用
     *
     * @return: java.lang.String
     **/
    @GetMapping("/sayHello")
    String sayHello();
}
