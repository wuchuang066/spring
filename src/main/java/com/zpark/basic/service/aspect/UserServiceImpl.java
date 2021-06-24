package com.zpark.basic.service.aspect;

import com.zpark.basic.entity.Customer;
import com.zpark.basic.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService, ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public boolean login(String userName, String password) {
        System.out.println("登录");
        return true;
    }

    @Override
    public boolean register(Customer cu) {
        System.out.println("注册成功，注册信息为:" + cu);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.login("123", "345");
        return true;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
