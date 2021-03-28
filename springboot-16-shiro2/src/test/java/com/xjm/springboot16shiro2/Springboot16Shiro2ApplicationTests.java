package com.xjm.springboot16shiro2;

import com.xjm.springboot16shiro2.pojo.User;
import com.xjm.springboot16shiro2.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot16Shiro2ApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        User user = userService.queryUserByName("张三");
        System.out.println(user);
    }

}
