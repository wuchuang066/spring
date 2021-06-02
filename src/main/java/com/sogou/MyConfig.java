package com.sogou;

import com.sogou.entity.Student;
import com.sogou.service.TestService;
import jdk.nashorn.internal.runtime.PrototypeObject;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @Classname MyConfig
 */
@Configuration
@ComponentScan(value = "com.sogou")
//@ComponentScan(value = "com.sogou",useDefaultFilters = false,includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
//})
//@Import({MyImportBeanDefinitionRegistrar.class})
public class MyConfig {

//    @Scope(value ="prototype" )
//    @Bean(name="stu")
//    @Lazy
//    @Conditional({TestCondition.class})
//    public Student student(){
//        return new Student(1,18,"lily");
//    }
    @Bean
    public TestService testService(){
        return new TestService();
    }
}
