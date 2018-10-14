package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangyang
 * @version 1.0
 * @date 2018/10/14 下午9:22
 * @description
 */
@RestController
public class DemoController {

    @GetMapping("/mock")
    public String demo(String msg){
        return msg;
    }

    @GetMapping("/")
    public String helloworld(){
        return "hello world";
    }
}
