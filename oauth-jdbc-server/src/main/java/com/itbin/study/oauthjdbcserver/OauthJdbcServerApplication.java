package com.itbin.study.oauthjdbcserver;

import org.mybatis.spring.annotation.MapperScan;
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
@SpringBootApplication
@EnableAuthorizationServer
@MapperScan(basePackages = "com.itbin.study.oauthjdbcserver.mapper")
public class OauthJdbcServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OauthJdbcServerApplication.class, args);
    }

}
