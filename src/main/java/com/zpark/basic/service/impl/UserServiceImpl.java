package com.zpark.basic.service.impl;

import com.zpark.basic.dao.UserDao;
import com.zpark.basic.entity.User;
import com.zpark.basic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean login(String userName, String password) {
        System.out.println("登录");
        return true;
    }

    @Override
    @Transactional
    public boolean register(User cu) {
        userDao.insertUsers(cu);
        throw new RuntimeException("ceshi");
       // return true;
    }
}
