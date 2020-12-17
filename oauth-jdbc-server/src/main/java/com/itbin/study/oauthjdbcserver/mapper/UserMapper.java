package com.itbin.study.oauthjdbcserver.mapper;

import com.itbin.study.oauthjdbcserver.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/6 14:59
 * @description:
 * @modified By:
 */
@Component
public interface UserMapper  {

    /**
     * 根据姓名查询会员
     *
     * @param userName:
     * @return: com.itbin.study.oauthjdbcserver.model.User
     **/
    @Select("select * from user where user_name = #{username}")
    User findUserByUserName(@Param(value = "username") String userName);
}
