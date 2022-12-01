package com.example.springbootdemo;

import com.example.springbootdemo.bean.UserBean;
import com.example.springbootdemo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootdemoApplicationTests {
    @Resource
    UserService userService;
    @Test
    void contextLoads() {
        UserBean userBean= userService.login("Mike","123");
        System.out.println("user Id is:");
        System.out.println(userBean.getId());
    }

}
