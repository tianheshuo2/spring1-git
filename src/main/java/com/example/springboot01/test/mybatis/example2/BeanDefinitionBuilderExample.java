package com.example.springboot01.test.mybatis.example2;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class BeanDefinitionBuilderExample {
    public static void main (String[] args) {
        DefaultListableBeanFactory beanFactory =
                new DefaultListableBeanFactory();
        BeanDefinitionBuilder b =
                BeanDefinitionBuilder.rootBeanDefinition(MyBean.class)
                        .addPropertyValue("str", "myStringValue");
        beanFactory.registerBeanDefinition("myBean", b.getBeanDefinition());
        MyBean bean = beanFactory.getBean(MyBean.class);
        bean.doSomething();
    }
}