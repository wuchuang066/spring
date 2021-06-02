package com.sogou;

import com.sogou.entity.Person;
import com.sogou.entity.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @Classname Test
 */
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestSpring {

    @Autowired
    private Student student;
    @Test
    public void test(){
        // the first one
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        String[] beanNamesForType = context.getBeanNamesForType(Student.class);
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
        System.out.println(student);
//        Person person = (Person)context.getBean("person");
//        System.out.println(person);
//        // getBean 的方法重载
//        // 当前spring配置文件中只能有一个bean类型class为Person类型
////        Person bean = context.getBean(Person.class);
////        System.out.println(bean);
//        Person person1 = context.getBean("person1", Person.class);
//        System.out.println(person1);
//        //
//        System.out.println("--------------------");
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
//        System.out.println("---------------------");
//
//        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
        // 只能判断id的bean是否存在
//        boolean per = context.containsBeanDefinition("person");
//        System.out.println(per);
        // 能用来判断name 和id
//        boolean person2 = context.containsBean("person");
//        System.out.println(person2);
//        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
//        Person xiaoming = (Person)context.getBean("person");
//        System.out.println(xiaoming);
//        boolean person = context.containsBean("2person");
//        System.out.println(person);
    }

}
