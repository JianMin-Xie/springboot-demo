package com.xjm.springboot03;

import com.xjm.springboot03.pojo.Person;
import com.xjm.springboot03.pojo.Person2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot03ApplicationTests {

    @Autowired
    Person person;

    @Autowired
    Person2 person2;

    @Test
    void contextLoads() {
//        System.out.println(person);
        System.out.println(person);
    }

}
