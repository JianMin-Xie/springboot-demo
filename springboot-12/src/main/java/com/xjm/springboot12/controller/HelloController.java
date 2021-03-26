package com.xjm.springboot12.controller;

import com.xjm.springboot12.pojo.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Panda
 * @create 2021-03-27 3:11
 */

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        return new User();
    }

    @ApiOperation("狂神的接口")
    @PostMapping("/kuang")
    @ResponseBody
    public String kuang(@ApiParam("这个名字会被返回")String username){
        return username;
    }
}
