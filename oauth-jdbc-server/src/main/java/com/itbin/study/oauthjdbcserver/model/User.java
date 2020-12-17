package com.itbin.study.oauthjdbcserver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/6 14:53
 * @description:
 * @modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private Long id;

    private String userName;

    private String password;

    private String phone;

    private String email;
}
