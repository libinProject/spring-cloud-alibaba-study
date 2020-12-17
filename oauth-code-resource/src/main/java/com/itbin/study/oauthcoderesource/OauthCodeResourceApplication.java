package com.itbin.study.oauthcoderesource;

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
@SpringBootApplication
@EnableResourceServer
public class OauthCodeResourceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthCodeResourceApplication.class, args);
    }

}
