package com.xjm.springboot16shiro2.service;

import com.xjm.springboot16shiro2.pojo.User;

/**
 * @author Panda
 * @create 2021-03-29 0:36
 */
public interface UserService {
    public User queryUserByName(String name);
}
