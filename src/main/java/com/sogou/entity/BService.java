package com.sogou.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Classname BService
 */
@Component
public class BService {
    @Autowired
    private AService aService;
}
