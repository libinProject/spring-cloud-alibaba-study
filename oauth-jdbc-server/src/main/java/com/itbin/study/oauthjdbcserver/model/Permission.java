package com.itbin.study.oauthjdbcserver.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/6 14:57
 * @description:
 * @modified By:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Permission {

    private Long id;

    private Long parentId;

    private String name;

    private String enName;

    private String url;

    private String description;
}
