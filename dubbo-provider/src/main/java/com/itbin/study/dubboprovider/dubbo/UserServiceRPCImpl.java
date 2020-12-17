package com.itbin.study.dubboprovider.dubbo;

import com.itbin.study.dubboapi.service.UserService;
import com.itbin.study.dubboprovider.mapper.UserMapper;
import com.itbin.study.dubboprovider.model.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/10 10:47
 * @description:
 * @modified By:
 */
@Service
public class UserServiceRPCImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String findUserName(Integer id) {
        User user = userMapper.selectById(id);
        if (null != user){
            return user.getUserName();
        }
        return "";
    }
}
