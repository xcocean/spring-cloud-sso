package com.qbccn.service.impl;

import com.qbccn.entity.SsoUser;
import com.qbccn.mapper.SsoUserMapper;
import com.qbccn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linke
 * @date 2019-12-23 下午 23:03
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SsoUserMapper ssoUserMapper;

    @Override
    public List<SsoUser> userList() {
        return ssoUserMapper.userList();
    }

    @Override
    public SsoUser getUserInfo(String username) {
        return ssoUserMapper.getUserInfo(username);
    }
}
