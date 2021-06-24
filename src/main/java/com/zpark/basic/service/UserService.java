package com.zpark.basic.service;

import com.zpark.basic.entity.Customer;

public interface UserService {

    boolean login(String userName,String password);

    boolean register(Customer cu);
}
