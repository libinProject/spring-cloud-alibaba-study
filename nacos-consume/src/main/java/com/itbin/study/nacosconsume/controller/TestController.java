package com.itbin.study.nacosconsume.controller;

import com.itbin.study.nacosconsume.feign.ProviderFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/10/19 14:29
 * @description:
 * @modified By:
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    ProviderFeignService providerFeignService;

    @GetMapping(value = "hello")
    public String hello(@RequestParam(value = "name") String name) {

        String result = "";

        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");

        URI uri = serviceInstance.getUri();

        result = restTemplate.getForObject(uri + "/test/hello?name=" + 123, String.class);
        return result;
    }

    @GetMapping("sayPort")
    public String loadBalanceTest() {
        String result = "";

        result = restTemplate.getForObject("http://nacos-provider/test/sayPort", String.class);

        return result;
    }

    @GetMapping(value = "sayHello")
    public String sayHello(@RequestParam(value = "name") String name){
        return providerFeignService.hello(name);
    }
}
