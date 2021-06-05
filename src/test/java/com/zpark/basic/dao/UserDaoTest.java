package com.zpark.basic.dao;

import com.zpark.basic.entity.Customer;
import com.zpark.basic.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class UserDaoTest {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("/applicationContextMybatisSpring.xml");
        UserDao userDao = (UserDao)context.getBean("userDao");
        User user = new User();
        user.setName("xiaohong");
        user.setPassword("123456");
        userDao.insertUsers(user);
    }

}