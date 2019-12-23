package com.qbccn.mapper;

import com.qbccn.entity.SsoRole;

/**
 * @author  linke
 * @date  2019-12-23 下午 22:59
 * @description 
 */
public interface SsoRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SsoRole record);

    int insertSelective(SsoRole record);

    SsoRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SsoRole record);

    int updateByPrimaryKey(SsoRole record);
}