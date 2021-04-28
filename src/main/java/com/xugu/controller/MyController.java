package com.xugu.controller;

import com.xugu.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
    private MyService myService;
    public void test(){
        System.out.println("mycontroller");
        myService.test();
    }
}