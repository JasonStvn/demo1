package com.example.demo1.controller;

import com.example.demo1.dao.entity.User;
import com.example.demo1.service.UserService;
import com.example.demo1.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
//    @Resource
//    private UserService userService;

    @RequestMapping("/getUserPageList")
    @ResponseBody
    public List<User> getUserPageList(User user){
        UserService userService = new UserServiceImpl();
        List<User> userList = userService.queryUserList(user);
        return userList;
    }
}
