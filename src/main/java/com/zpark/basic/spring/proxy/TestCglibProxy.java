package com.zpark.basic.spring.proxy;

import com.zpark.basic.service.aspect.UserServiceImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

public class TestCglibProxy {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        /**
         *
         *
         * Enhancer.create() --> 代理
         * classloader()
         * Superclass()
         * Callback()
         *
         */
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(TestCglibProxy.class.getClassLoader());
        enhancer.setSuperclass(userService.getClass());
//        enhancer.setCallback(new MethodInterceptor() {
//            @Override
//            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
//                return method.invoke(userService,args);
//            }
//        });
        enhancer.setCallback((MethodInterceptor) (o, method, args1, methodProxy) -> {
            System.out.println("cglib---log");
            return method.invoke(userService, args1);
        });
        UserServiceImpl o = (UserServiceImpl) enhancer.create();
        o.login("123", "234");

    }
}
