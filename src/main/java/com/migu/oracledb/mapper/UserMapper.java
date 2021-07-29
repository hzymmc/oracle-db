package com.migu.oracledb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.migu.oracledb.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
