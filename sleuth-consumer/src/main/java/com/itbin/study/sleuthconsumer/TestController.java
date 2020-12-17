package com.itbin.study.sleuthconsumer;

import com.itbin.study.sleuthconsumer.feign.SleuthServiceFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/9 17:01
 * @description:
 * @modified By:
 */
@Slf4j
@RestController
public class TestController {

    @Autowired
    private SleuthServiceFeign sleuthServiceFeign;

    @GetMapping("sayHello")
    public String sayHello() {
        log.info("start feign " + 1);
        String feignResult = sleuthServiceFeign.sayHello();
        log.info("start feign " + 2);
        return feignResult;
    }
}
