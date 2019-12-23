package com.qbccn.mapper;

import com.qbccn.entity.SsoRole;

import java.util.List;

/**
 * @author  linke
 * @date  2019-12-23 下午 22:10
 * @description 
 */
public interface SsoRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SsoRole record);

    int insertSelective(SsoRole record);

    SsoRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SsoRole record);

    int updateByPrimaryKey(SsoRole record);

    List<SsoRole> getRoleList(Integer userId);
}