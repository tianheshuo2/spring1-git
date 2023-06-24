package com.example.springboot01.test.mybatis.myproxy02;

import org.springframework.stereotype.Service;

//@Service
public class Car implements IVehical {
    public void run() {
        System.out.println("Car会跑");
    }
}
