package com.xjm.springboot02;

import com.xjm.springboot02.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DemoApplicationTests {

//    @Autowired
//    Person person; //将person自动注入进来

    @Autowired
    User user;

    @Test
    public void contextLoads() {
//        System.out.println(person); //打印person信息
        System.out.println(user);
    }

}