package com.example.springboot01.test.mybatis.example4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDefinitionRegistryPostProcessorExample {
    public static void main (String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        MyBean bean = (MyBean) context.getBean("myBeanName");
        bean.doSomething();
    }
}