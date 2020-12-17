package com.itbin.study.oauthjdbcserver;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/5 16:41
 * @description:
 * @modified By:
 */
public class TestApp {

    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
