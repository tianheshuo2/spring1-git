package com.example.springboot01.test;

import com.example.springboot01.test.mybatis.myproxy02.IVehical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class MyController {

    @Resource
    IVehical vehical;

    @RequestMapping(value="/test")
    public String test() {
        vehical.run();
        return "abcdd纯纯粹粹dddaaaaaa";
        // comment
    }
}
