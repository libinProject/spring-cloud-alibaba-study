package com.itbin.study.dubboprovider.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/10 10:17
 * @description:
 * @modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private Integer id;

    private String userName;

    private String userPhone;
}
