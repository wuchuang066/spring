package com.zpark.basic.applicationContext;

import com.zpark.basic.entity.Customer;
import com.zpark.basic.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class Test2 {
    /**
     * 测试FactoryBean生成复杂对象，同时使用小配置文件
     * getBean 获取的是getObject() 方法生成的原始对象
     * &获取的是代理对象（MyFactoryBean）
     *
     */
    @Test
    public void testFactoryBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext2.xml");
        Connection myConnection = (Connection) context.getBean("myConnection");
        System.out.println(myConnection);
        System.out.println(context.getBean("&myConnection"));
    }
    /**
     *    * 初始化 spring的声明周期
     * 测试实体类继承InitailizationBean
     */
    @Test
    public void testCustomer() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Customer customer = (Customer) context.getBean("customer");
        System.out.println(customer);
    }
    /**
     *   测试自定义转换器 生日2020-01-01
     *   测试BeanPostProcesser  所有spring注册的bean 都执行了beanPostProcesser 的before 和after方法
     */
    @Test
    public void testConverter() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext2.xml");
        Customer customer = (Customer) context.getBean("customer2");
        System.out.println(customer);
    }

    /**
     * 测试MethodBeforeAdvice
     */
    @Test
    public void testMethodBeforeAdvice() {
        ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext2.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.login("123","234");
    }
}
