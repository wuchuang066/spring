package com.zpark.basic.applicationContext;

import com.zpark.basic.entity.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    /**
     * 测试实体类注入各种属性
     */
    @Test
    public void testCustomer() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);
    }
}
