package com.qbccn.service;

import com.qbccn.entity.SsoUser;

import java.util.List;

/**
 * @author linke
 * @date 2019-12-23 下午 23:03
 * @description
 */
public interface UserService {

    List<SsoUser> userList();

    SsoUser getUserInfo(String username);
}
