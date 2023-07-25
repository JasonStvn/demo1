package com.example.demo1.service;

import com.example.demo1.dao.entity.User;
import com.example.demo1.dao.vo.UserVO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> queryUserList(User user);

    int updateStatus(User user);

    int deleteById(int id);

    UserVO viewUser(int id);
}
