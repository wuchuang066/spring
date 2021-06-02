package com.sogou.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Classname AService
 */
@Component
public class AService {

    @Autowired
    private BService bService;
}
