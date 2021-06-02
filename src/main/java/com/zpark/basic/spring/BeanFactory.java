package com.zpark.basic.spring;

import com.zpark.basic.dao.UserDao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {
    private static Properties env = new Properties();
    static {
        InputStream inputStream = null;
        try {
            inputStream = MyBeanFactory.class.getResourceAsStream("/applicationContext.properties");
            env.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static Object getBean(String beanId){
        Object bean = null;
        try {
            Class clazz = Class.forName(env.getProperty(beanId));
            bean = clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
        }
        return bean;
    }

    public static void main(String[] args) {
        UserDao userDao = (UserDao)getBean("userDao");
        System.out.println(userDao);
    }

}
