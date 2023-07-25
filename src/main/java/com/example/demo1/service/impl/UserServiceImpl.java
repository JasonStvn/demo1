package com.example.demo1.service.impl;

import com.example.demo1.MybatisUtils;
import com.example.demo1.dao.UserMapper;
import com.example.demo1.dao.entity.User;
import com.example.demo1.dao.vo.UserVO;
import com.example.demo1.service.UserService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class UserServiceImpl implements UserService {

    @Override
    public List<User> queryUserList(User user){
        SqlSession session = MybatisUtils.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        return mapper.selectUserList(user);
    }

    @Override
    public int updateStatus(User user){
        SqlSession session = MybatisUtils.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        return mapper.updateStatus(user);
    }

    @Override
    public int deleteById(int id){
        SqlSession session = MybatisUtils.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        return mapper.deleteById(id);
    }

    @Override
    public UserVO viewUser(int id){
        SqlSession session = MybatisUtils.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        return mapper.viewUser(id);
    }


    public static void main(String[] args) {
        System.out.println(0%7);
    }
}
