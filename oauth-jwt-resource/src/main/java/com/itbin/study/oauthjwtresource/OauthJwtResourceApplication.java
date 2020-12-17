package com.itbin.study.oauthjwtresource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/2/25 10:55
 * @description:
 * @modified By:
 */
@EnableResourceServer
@SpringBootApplication
public class OauthJwtResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthJwtResourceApplication.class, args);
    }

}
