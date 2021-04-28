package com.xugu.service;

import com.xugu.dao.UserDao;
import com.xugu.dao.UserDaoI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class UserService {
    @Autowired
    private UserDao userdao;

    @Autowired
    @Qualifier(value = "user")
    private UserDaoI userDaoI;

    public UserDao getUserdao() {
        return userdao;
    }

    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }
    public  void  test(){
        System.out.println("service");
        userdao.test();
        userDaoI.test();
    }

}
