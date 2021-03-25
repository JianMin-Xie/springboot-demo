package com.xjm.springboot01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Panda
 * @create 2021-03-24 4:00
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello,world";
    }
}
