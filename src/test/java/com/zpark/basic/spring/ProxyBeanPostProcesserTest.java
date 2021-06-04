package com.zpark.basic.spring;

import com.zpark.basic.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyBeanPostProcesserTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext3.xml");
        OrderService orderService =  (OrderService)context.getBean("orderServiceImpl");
        orderService.order("小红红");
    }

}