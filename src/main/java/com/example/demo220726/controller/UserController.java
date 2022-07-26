package com.example.demo220726.controller;

import com.example.demo220726.entity.User;
import com.example.demo220726.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUser")
    public List<User> findAllUser(){

        return userService.list();
    }

    @GetMapping("/findById/{uid}")
    public User findById(@PathVariable("uid") Integer uid){

        return userService.getById(uid);
    }


    @DeleteMapping("/deleteById/{uid}")
    public boolean deleteById(@PathVariable("uid") Integer uid){
        return  userService.removeById(uid);
    }




    @PostMapping("/add")
    public boolean add(@RequestBody User user){
        return userService.save(user);
    }




    @PutMapping("/update")
    public boolean update(@RequestBody User user){
        return userService.updateById(user);
    }
}

