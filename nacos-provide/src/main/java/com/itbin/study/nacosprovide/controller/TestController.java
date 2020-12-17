package com.itbin.study.nacosprovide.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/10/19 14:19
 * @description:
 * @modified By:
 */
@RestController
@RefreshScope
@RequestMapping(value = "test")
public class TestController {

    @Value("${server.port}")
    String port;

    @Value("${data.testName}")
    String testName;

    @GetMapping("hello")
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name;
    }

    @GetMapping("sayPort")
    public String sayPort(){
        return "hello " + port;
    }

    @GetMapping("testName")
    public String getTestName(){
        return testName;
    }
}
