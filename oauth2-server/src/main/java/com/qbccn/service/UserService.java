package com.qbccn.service;

import com.qbccn.entity.SsoRole;
import com.qbccn.entity.SsoUser;

import java.util.List;

public interface UserService {

    SsoUser getUserInfo(String username);

    List<SsoRole> getRoleByUserId(Integer userId);
}
