package com.example.springboot01.test.mybatis.example2;

public class MyBean {
    private String str;
    public void setStr (String str) {
        this.str = str;
    }
    public void doSomething () {
        System.out.println("from MyBean " + str);
    }
}