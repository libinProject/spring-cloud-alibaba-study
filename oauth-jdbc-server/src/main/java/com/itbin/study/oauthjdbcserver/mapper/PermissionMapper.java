package com.itbin.study.oauthjdbcserver.mapper;

import com.itbin.study.oauthjdbcserver.model.Permission;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/6 15:45
 * @description:
 * @modified By:
 */
@Component
public interface PermissionMapper  {

    @Select("select p.* " +
            "FROM user_role ur " +
            "INNER JOIN role_permission rp on rp.role_id = ur.role_id " +
            "INNER JOIN permission p on p.id = rp.permission_id " +
            "WHERE ur.user_id = #{userId}")
    List<Permission> findListByUser(@Param(value = "userId") Long userId);
}
