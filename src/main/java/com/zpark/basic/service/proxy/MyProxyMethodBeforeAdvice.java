package com.zpark.basic.service.proxy;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class MyProxyMethodBeforeAdvice implements MethodBeforeAdvice {
    /**
     * 作⽤：需要把运⾏在原始⽅法执⾏之前运⾏的额外功能，书写在before⽅法中
     * @param method
     * @param objects
     * @param o
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("MyProxyMethodBeforeAdvice:"+method);
    }
}
