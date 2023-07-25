package com.example.demo1.controller;

import com.example.demo1.dao.entity.User;
import com.example.demo1.service.UserService;
import com.example.demo1.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserDeleteController {
    //        private UserService userService;
    @GetMapping("/DeleteById")
    @ResponseBody
    public void DeleteById(@RequestParam("id") Integer id, Model model) {
        UserService userService = new UserServiceImpl();
        try {
            if (id == null) {
                model.addAttribute("errorMsg", "id can not be null!");
            }

            int n = userService.deleteById(id);

            if (n != 1) {
                model.addAttribute("errorMsg", "delete user by id fail!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            List<User> userList = userService.queryUserList(new User());
            model.addAttribute("userList", userList);
        }
    }
}