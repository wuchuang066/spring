package com.zpark.basic.service.impl;

import com.zpark.basic.service.OrderService;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {
    @Override
    public boolean order(String goodsName) {
        System.out.println("orderService 中订购了" + goodsName + "的商品");
        return false;
    }
}
