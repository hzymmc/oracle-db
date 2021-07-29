package com.migu.oracledb.controller;

import com.migu.oracledb.entity.User;
import com.migu.oracledb.service.impl.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("getList")
    public List<User> getList() {
        return userService.list();
    }
}
