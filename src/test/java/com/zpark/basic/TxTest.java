package com.zpark.basic;

import com.zpark.basic.entity.Customer;
import com.zpark.basic.entity.User;
import com.zpark.basic.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class TxTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContextMybatisSpring.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setName("xiaowangba");
        user.setPassword("234234");
        userService.register(user);
    }
}
