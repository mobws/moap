package com.mobws.service.controller;

import com.mobws.service.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: liujn
 * @Date: 2018/8/17 13:12
 * @Description: 测试用例
 */
@RestController
public class HelloWorldController {

    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    public User getUser(){

        User user = new User();
        user.setPk_user("P11111");
        user.setUser_code("100101");
        user.setUser_name("测试用户");

        return user;
    }


}
