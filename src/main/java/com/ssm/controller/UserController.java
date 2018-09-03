package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mac on 2018/8/29.
 */

@RestController
public class UserController {



    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public void  addUser(String name,int age){
        User user = new User(name,age);
        userService.save(user);
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    public boolean deleteUserById(int id){
        return userService.deleteById(id);
    }


    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public boolean deleteUserById(int id,String name, int age){
        User user = new User(id,name,age);
        return userService.updateById(user);
    }


    @RequestMapping(value = "/queryUser",method = RequestMethod.GET)
    public User getUserById(int id){
        System.out.println(id);
        return userService.getUser(id);
    }
}
