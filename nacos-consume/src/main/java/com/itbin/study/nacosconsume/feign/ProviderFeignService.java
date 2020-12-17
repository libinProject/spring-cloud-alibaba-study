package com.itbin.study.nacosconsume.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/10/21 11:40
 * @description:
 * @modified By:
 */
@Component
@FeignClient(name = "nacos-provider")
public interface ProviderFeignService {

    @GetMapping(value = "test/hello")
    String hello(@RequestParam(value = "name") String name);
}
