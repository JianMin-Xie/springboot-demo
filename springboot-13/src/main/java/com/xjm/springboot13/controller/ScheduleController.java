package com.xjm.springboot13.controller;

import com.xjm.springboot13.service.ScheduledService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Panda
 * @create 2021-03-27 6:34
 */
@RestController
public class ScheduleController {
    @Autowired
    ScheduledService scheduledService;

    @GetMapping("/hello2")
    public String hello(){
        scheduledService.hello();
        return "success";
    }
}
