package com.example.springboot01.test.mybatis.example2;

public class Bean1 {
    private Bean2 otherBean;
    public void setOtherBean (Bean2 otherBean) {
        this.otherBean = otherBean;
    }
    public void doSomething () {
        otherBean.doSomething();
    }
}
