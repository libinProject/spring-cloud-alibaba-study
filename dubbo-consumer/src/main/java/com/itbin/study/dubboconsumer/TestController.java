package com.itbin.study.dubboconsumer;

import com.itbin.study.dubboapi.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/10 11:39
 * @description:
 * @modified By:
 */
@RestController
public class TestController {

    @Reference(check = false)
    private UserService userService;

    @GetMapping(value = "getUser")
    public String getUser(Integer id) {
        return userService.findUserName(id);
    }
}
