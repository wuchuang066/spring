package com.zpark.basic.service.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class MyArround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("MethodInterceptor  -----------log---------before");
        Object proceed = methodInvocation.proceed();
        System.out.println("MethodInterceptor  -----------log---------after");
        return proceed;
    }
}
