package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired(required=false)
    public UserMapper userMapper;

    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }

    public List<User> findUserByUserId(int userid){
        return userMapper.findUserByUserId(userid);
    }

    public List<User> findUserByUsername(String username){
        return userMapper.findUserByUsername(username);
    }

    public User insertUser(User user){
        userMapper.insertUser(user);
        return user;
    }

    public int updateUser(User user){
        return userMapper.updateUser(user);
    }

    public int deleteUser(User user){
        return userMapper.deleteUser(user);
    }
}