package com.zpark.basic.service.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Pointcut("execution(* com.zpark.basic.service.aspect.UserServiceImpl.*(..))")
    public void pointcut(){}
    @Around(value = "pointcut()")
    public Object loginProxy(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("注解增强  log");
        Object proceed = joinPoint.proceed();
        return proceed;
    }
    @Around(value = "pointcut()")
    public Object registerProxy(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("注解增强  事物");
        Object proceed = joinPoint.proceed();
        return proceed;
    }
}
