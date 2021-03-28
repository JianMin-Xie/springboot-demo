package com.xjm.springboot16shiro2.service;

import com.xjm.springboot16shiro2.mapper.UserMapper;
import com.xjm.springboot16shiro2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Panda
 * @create 2021-03-29 0:37
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByName(String name) {
        return userMapper.queryUserByName(name);
    }
}
