package com.itbin.study.oauthjdbcserver.config;

import com.itbin.study.oauthjdbcserver.mapper.PermissionMapper;
import com.itbin.study.oauthjdbcserver.mapper.UserMapper;
import com.itbin.study.oauthjdbcserver.model.Permission;
import com.itbin.study.oauthjdbcserver.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : LIBIN
 * @version : v1
 * @date : Created in  2020/11/6 15:51
 * @description:
 * @modified By:
 */
@Service("myUserDetailsService")
@Primary
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userMapper.findUserByUserName(s);
        if (null == user){
            return null;
        }

        List<GrantedAuthority>grantedAuthorityList = new ArrayList<>();

        List<Permission> permissionList = permissionMapper.findListByUser(user.getId());

        if (null != permissionList && ! permissionList.isEmpty()){
            permissionList.stream().forEach(item->{
                GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(item.getEnName());
                grantedAuthorityList.add(grantedAuthority);
            });
        }

        return new org.springframework.security.core.userdetails.User(user.getUserName(),user.getPassword(),grantedAuthorityList);
    }
}
