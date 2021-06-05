package com.zpark.basic.spring;

import com.zpark.basic.entity.Customer;
import com.zpark.basic.service.OrderService;
import com.zpark.basic.service.aspect.UserService;
import com.zpark.basic.service.aspect.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyBeanPostProcesserTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext3.xml");
      //  OrderService orderService =  (OrderService)context.getBean("orderServiceImpl");
        //orderService.order("小红红");
        UserService userService =  (UserService)context.getBean("userService");
     //   userService.login("asd","wer");
        userService.register(new Customer());
    }

}