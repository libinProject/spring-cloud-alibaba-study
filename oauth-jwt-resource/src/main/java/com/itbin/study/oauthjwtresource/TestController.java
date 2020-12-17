package com.itbin.study.oauthjwtresource;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/3 15:33
 * @description:
 * @modified By:
 */
@RestController
public class TestController {

    @GetMapping("api/hello")
    public Authentication test(Authentication authentication){
        return authentication;
    }
}
