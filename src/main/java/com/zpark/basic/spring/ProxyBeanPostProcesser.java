package com.zpark.basic.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

@Component
public class ProxyBeanPostProcesser implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        InvocationHandler handler = (proxy, method, args) -> {
            System.out.println("增强的添加log");
            return method.invoke(bean,args);
        };
       return Proxy.newProxyInstance(ProxyBeanPostProcesser.class.getClassLoader(),bean.getClass().getInterfaces(),handler);
    }
}
