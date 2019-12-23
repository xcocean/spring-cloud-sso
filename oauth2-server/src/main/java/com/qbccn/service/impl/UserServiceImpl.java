package com.qbccn.service.impl;

import com.qbccn.entity.SsoRole;
import com.qbccn.entity.SsoUser;
import com.qbccn.mapper.SsoRoleMapper;
import com.qbccn.mapper.SsoUserMapper;
import com.qbccn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linke
 * @date 2019-12-23 下午 22:11
 * @description
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SsoUserMapper ssoUserMapper;
    @Autowired
    private SsoRoleMapper ssoRoleMapper;

    @Override
    public SsoUser getUserInfo(String username) {
        return ssoUserMapper.get(username);
    }

    @Override
    public List<SsoRole> getRoleByUserId(Integer userId) {
        return ssoRoleMapper.getRoleList(userId);
    }
}
