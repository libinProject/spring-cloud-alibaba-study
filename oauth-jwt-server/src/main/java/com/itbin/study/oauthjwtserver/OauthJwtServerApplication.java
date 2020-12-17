package com.itbin.study.oauthjwtserver;

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
public class OauthJwtServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthJwtServerApplication.class, args);
    }

}
