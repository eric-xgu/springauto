package com.xugu;

import com.xugu.controller.MyController;
import com.xugu.dao.MyDao;
import com.xugu.service.MyService;
import com.xugu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //获取spring上下文环境
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        /*MyDao myDao=(MyDao) ac.getBean("myDao");
        myDao.test();
        MyService myService=(MyService) ac.getBean("myService");
        myService.test();
        */
        MyController myController=(MyController) ac.getBean("myController");
        myController.test();
    }
}
