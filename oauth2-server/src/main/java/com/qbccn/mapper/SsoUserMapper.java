package com.qbccn.mapper;

import com.qbccn.entity.SsoUser;

/**
 * @author  linke
 * @date  2019-12-23 下午 22:09
 * @description 
 */
public interface SsoUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SsoUser record);

    int insertSelective(SsoUser record);

    SsoUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SsoUser record);

    int updateByPrimaryKey(SsoUser record);

    SsoUser get(String username);
}