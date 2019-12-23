package com.qbccn.controller;

import com.qbccn.dto.ResponseResult;
import com.qbccn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linke
 * @date 2019-12-23 下午 22:58
 * @description
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("info/{username}")
    public ResponseResult info(@PathVariable("username")String username){
        return new ResponseResult(ResponseResult.CodeStatus.OK,userService.getUserInfo(username));
    }
}
