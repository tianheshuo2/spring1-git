package com.example.springboot01.test;

import com.example.springboot01.test.mybatis.myproxy02.Car;
import com.example.springboot01.test.mybatis.myproxy02.IVehical;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public IVehical myBean() {
        return new Car();
        // return null;
    }

    /**
     * This is my config
     * @return
     */
    @Bean
    public CustomBeanPostProcessor customBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }
}