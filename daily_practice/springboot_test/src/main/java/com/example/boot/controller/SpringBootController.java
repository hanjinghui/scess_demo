package com.example.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {

    @RequestMapping("/test")
    public String test(){
        return "你好，世界a。。。。";
    }
}
