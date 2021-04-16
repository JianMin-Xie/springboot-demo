package com.xjm;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xjm.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Springboot17RedisApplicationTests {

    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {

        redisTemplate.opsForValue().set("name","xjm");
        System.out.println(redisTemplate.opsForValue().get("name"));
        RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
        connection.flushAll();
        connection.close();

    }

    @Test
    void test2() throws JsonProcessingException {
        User user = new User();
//        String jsonUser = new ObjectMapper().writeValueAsString(user);
        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }


    @Test
    void test1() throws JsonProcessingException {
        User name1 = new User("xjm", 3);
        String name = new ObjectMapper().writeValueAsString(name1);
        redisTemplate.opsForValue().set("key1", name);
        System.out.println(redisTemplate.opsForValue().get("key1"));

    }
}
