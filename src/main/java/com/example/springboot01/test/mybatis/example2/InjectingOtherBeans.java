package com.example.springboot01.test.mybatis.example2;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class InjectingOtherBeans {
    public static void main (String[] args) {
        DefaultListableBeanFactory context =
                new DefaultListableBeanFactory();
        //define and register MyOtherBean
        GenericBeanDefinition beanOtherDef = new GenericBeanDefinition();
        beanOtherDef.setBeanClass(Bean2.class);
        context.registerBeanDefinition("other", beanOtherDef);
        //definine and register myBean
        GenericBeanDefinition beanDef = new GenericBeanDefinition();
        beanDef.setBeanClass(Bean1.class);
        MutablePropertyValues mpv = new MutablePropertyValues();
        mpv.addPropertyValue("otherBean", context.getBean("other"));
        beanDef.setPropertyValues(mpv);
        context.registerBeanDefinition("myBean", beanDef);
        //using MyBean instance
        Bean1 bean = context.getBean(Bean1.class);
        bean.doSomething();
    }
}