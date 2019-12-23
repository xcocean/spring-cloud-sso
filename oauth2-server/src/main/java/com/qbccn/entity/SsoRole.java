package com.qbccn.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author  linke
 * @date  2019-12-23 下午 22:10
 * @description 
 */
@Data
public class SsoRole implements Serializable {
    private Integer id;

    private Integer userId;

    private String roleName;

    private String roleDesc;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}