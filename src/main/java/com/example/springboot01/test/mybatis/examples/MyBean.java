package com.example.springboot01.test.mybatis.examples;

import java.util.Date;

public class MyBean {
    private Date date;
    public void doSomething () {
        System.out.println("from my bean, date: " + date);
    }
    public void setDate (Date date) {
        this.date = date;
    }
}