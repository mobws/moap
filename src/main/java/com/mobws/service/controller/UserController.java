package com.mobws.service.controller;

import com.mobws.service.bean.User;
import com.mobws.service.dao.UserMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: liujn
 * @Date: 2018/8/17 13:12
 * @Description: 用户 Controller
 */
@RestController
public class UserController {

    @Resource
    UserMapper um;

    @RequestMapping(value = "/getuser", method = RequestMethod.GET)
    public List<User> getAllUser(){

        ArrayList<User> userArrayList = um.listUser();

        return userArrayList;
    }


}
