package com.qbccn.controller;

import com.qbccn.dto.ResponseResult;
import com.qbccn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linke
 * @date 2019-12-23 下午 22:58
 * @description
 */
@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private UserService userService;

    @GetMapping("userList")
    public ResponseResult userList() {
        return new ResponseResult(ResponseResult.CodeStatus.OK, userService.userList());
    }
}
