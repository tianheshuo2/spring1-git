package com.example.springboot01.test.mybatis.example3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    MyConfigBean myConfigBean () {
        return new MyConfigBean();
    }
}