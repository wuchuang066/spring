package com.sogou;


import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Classname TestCondition
 */
public class TestCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        boolean stu = registry.containsBeanDefinition("stu");
        if(stu){
            return true;
        }
        return false;
    }
}
