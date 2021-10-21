package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getAllUser")
    public List<User> findAll(){
        return userService.findAllUser();
    }

    @RequestMapping("/getUserByUserID/{userid}")
    public List<User> findUserByUserId(@PathVariable int userid){
        return userService.findUserByUserId(userid);
    }

    @RequestMapping("/getUserByUsername/{username}")
    public List<User> findUserByUsername(@PathVariable String username){
        return userService.findUserByUsername(username);
    }

    @RequestMapping("/insertUser")
    public User insertUser(User user){
        return userService.insertUser(user);
    }

    @RequestMapping("/updateUser")
    public int updateUser(User user){
        return userService.updateUser(user);
    }

    @RequestMapping("/deleteUser")
    public int deleteUser(User user){
        return userService.deleteUser(user);
    }
}