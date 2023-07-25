package com.example.demo1.dao;

import com.example.demo1.dao.entity.User;
import com.example.demo1.dao.vo.UserVO;

import java.util.List;


public interface UserMapper {
    List<User> selectUserList(User user);

    int updateStatus(User user);

    int deleteById(int id);

    UserVO viewUser(int id);
}
