package com.sogou;

import com.sogou.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * @Classname TestSpringXunhuan
 */
public class TestSpringXunhuan {
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);
        Set<Student> set = new HashSet<>();
        Object testService = context.getBean("&testService");
        System.out.println(testService);
    }
}
