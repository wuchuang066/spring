package com.zpark.basic.service;

import com.zpark.basic.entity.Customer;
import com.zpark.basic.entity.User;

public interface UserService {

    boolean login(String userName,String password);

    boolean register(User cu);
}
