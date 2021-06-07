package com.zpark.basic;

import com.zpark.basic.entity.Customer;
import com.zpark.basic.entity.User;
import com.zpark.basic.service.UserService;
import com.zpark.basic.service.impl.UserServiceImpl;
import com.zpark.basic.spring.MyFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class MyFactoryBeanTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext2.xml");
        Connection myConnection = (Connection) context.getBean("myConnection");
        System.out.println(myConnection);
//        MyFactoryBean myConnectionFactory = (MyFactoryBean)context.getBean("myConnection");
//        System.out.println(myConnectionFactory);
        System.out.println("-----");
        Customer cu = (Customer) context.getBean("customer");
        System.out.println(cu);
        System.out.println("------------------------aop------------------------------");
        UserService userServiceImpl = (UserService) context.getBean("userServiceImpl");
        userServiceImpl.login("123", "3242");
        userServiceImpl.register(new User());
    }

}