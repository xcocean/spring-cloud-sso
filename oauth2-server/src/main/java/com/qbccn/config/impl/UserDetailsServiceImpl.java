package com.qbccn.config.impl;

import com.qbccn.entity.SsoRole;
import com.qbccn.entity.SsoUser;
import com.qbccn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component//交给spring托管
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 查询用户信息
        SsoUser user = userService.getUserInfo(username);
        if (user == null) {
            throw new UsernameNotFoundException("帐号：" + username + " 不存在！");
        }
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        //查询拥有的角色
        List<SsoRole> roles = userService.getRoleByUserId(user.getId());
        roles.forEach(r -> {
            //security的验证规则需要ROLE_ 对应数据库的角色名称也要以ROLE_XXXX这种形式
            grantedAuthorities.add(new SimpleGrantedAuthority(r.getRoleName()));
        });
        //spring5+要求密码加密，这里传明文密码，所以再加密
        String password = new BCryptPasswordEncoder().encode(user.getPassword());
        return new User(user.getUsername(), password, grantedAuthorities);
    }
}

