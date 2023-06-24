package com.example.springboot01.test.mybatis.myproxy01;

import java.lang.reflect.Proxy;

public class Demo {
    public static void main(String[] args) {
        People obj = new People();
        Object proxyObj = Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new ProxyInvocationHandler(obj));

        Eat eatObj = (Eat) proxyObj;
        eatObj.eat();
        System.out.println();

        Sleep sleepObj = (Sleep) proxyObj;
        sleepObj.sleep(8);
        System.out.println();

        sleepObj.sleep(-1);
        System.out.println();
    }

// 运行结果
// 方法调用之前
// 吃饭
// 方法调用之后

// 方法调用之前
// 睡觉，时长：8
// 方法调用之后

// 方法调用之前
// 睡觉，时长：-1
// 统一处理异常
// 方法调用之后
}
