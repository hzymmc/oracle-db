package com.migu.oracledb.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.migu.oracledb.entity.User;
import com.migu.oracledb.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
