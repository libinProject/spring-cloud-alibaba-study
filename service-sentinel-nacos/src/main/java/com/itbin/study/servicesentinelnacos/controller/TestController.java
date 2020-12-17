package com.itbin.study.servicesentinelnacos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/10/22 11:41
 * @description:
 * @modified By:
 */
@RestController
@RequestMapping(value = "test")
public class TestController {

    @GetMapping(value = "sayHello")
    public String syaHello(@RequestParam(value = "name") String name) {
        return "hello " + name;
    }
}
