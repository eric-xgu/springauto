package com.xugu.service;

import com.xugu.dao.MyDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MyService {
    @Resource
    private MyDao myDao;

    public void test(){
        System.out.println("myservice");
        myDao.test();
    }
}
