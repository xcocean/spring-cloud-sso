package com.qbccn.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author  linke
 * @date  2019-12-23 下午 22:09
 * @description 
 */
@Data
public class SsoUser implements Serializable {
    private Integer id;

    private String name;

    private String username;

    private String password;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}