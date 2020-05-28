package com.course.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Resource
    private TestService testService;


    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
