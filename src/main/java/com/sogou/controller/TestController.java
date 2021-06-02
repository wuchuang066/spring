package com.sogou.controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;

/**
 * @Classname TestController
 */
@Controller
public class TestController implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }
}
