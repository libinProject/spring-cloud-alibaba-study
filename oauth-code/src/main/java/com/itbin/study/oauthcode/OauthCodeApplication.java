package com.itbin.study.oauthcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/2/25 10:55
 * @description:
 * @modified By:
 */
@EnableAuthorizationServer
@SpringBootApplication
public class OauthCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthCodeApplication.class, args);
    }

}
