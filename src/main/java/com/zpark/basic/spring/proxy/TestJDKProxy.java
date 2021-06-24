package com.zpark.basic.spring.proxy;

import com.zpark.basic.service.UserService;
import com.zpark.basic.service.aspect.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestJDKProxy {
    public static void main(String[] args) {
        UserService u = new UserServiceImpl();

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("aop 前置log");
                return method.invoke(u,args);
            }
        };
        UserService userService = (UserService)Proxy.newProxyInstance(u.getClass().getClassLoader(), u.getClass().getInterfaces(), handler);
        userService.login("123","324");
    }
}
