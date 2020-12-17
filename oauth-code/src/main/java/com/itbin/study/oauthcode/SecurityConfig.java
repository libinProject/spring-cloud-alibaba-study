package com.itbin.study.oauthcode;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/3 14:46
 * @description:
 * @modified By:
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        // 添加调试用户（admin admin）

        // step 1 创建内存模式得用户管理器
        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager();

        // step 2 添加用户 （用户名 密码 角色）
        inMemoryUserDetailsManager.createUser(
                User.withUsername("admin")
                .password(PasswordEncoderFactories.createDelegatingPasswordEncoder()
                .encode("admin"))
                .authorities("USER").build()
        );

        // step 3 返回用户管理器
        return inMemoryUserDetailsManager;
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }
}
