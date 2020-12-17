package com.itbin.study.sleuthprovider;

import brave.propagation.ExtraFieldPropagation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/9 16:54
 * @description:
 * @modified By:
 */
@Slf4j
@RestController
public class TestController {

    @GetMapping("sayHello")
    public String sayHello() {
        log.info("start 1");

        return "hello world" + ExtraFieldPropagation.get("BaggraceId");
    }
}
