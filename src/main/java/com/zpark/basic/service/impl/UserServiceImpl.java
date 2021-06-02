package com.zpark.basic.service.impl;

import com.zpark.basic.entity.Customer;
import com.zpark.basic.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(String userName, String password) {
        System.out.println("登录");
        return true;
    }

    @Override
    public boolean register(Customer cu) {
        System.out.println("注册成功，注册信息为:" + cu);
        return true;
    }
}
