package com.zpark.basic.spring;

import com.zpark.basic.dao.UserDao;
import com.zpark.basic.service.UserService;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 自己写的工厂类
 */
public class MyBeanFactory {
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

    public static UserService getUserService() {
        UserService userService = null;
        try {
            Class clazz = Class.forName(env.getProperty("userService"));
            userService = (UserService) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
        }
        return userService;
    }
    public static UserDao getUserDao(){
        UserDao userDao = null;
        try {
            Class clazz = Class.forName(env.getProperty("userDao"));
            userDao = (UserDao) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
        }
        return userDao;

    }

    public static void main(String[] args) {
        UserService userService = getUserService();
        System.out.println(userService);
        UserDao userDao = getUserDao();
        System.out.println(userDao);
    }
}
