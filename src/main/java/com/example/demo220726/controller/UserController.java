package com.example.demo220726.controller;

import com.example.demo220726.entity.User;
import com.example.demo220726.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doc.html")
@Api(value = "用户接口", tags = {"用户接口"})
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUser")
    @ApiOperation("显示所有记录")
    public List<User> findAllUser(){

        return userService.list();
    }

    @GetMapping("/findById/{uid}")
    @ApiOperation("根据uid查询数据")
    public User findById(@PathVariable("uid") Integer uid){

        return userService.getById(uid);
    }


    @DeleteMapping("/deleteById/{uid}")
    @ApiOperation("根据uid删除数据")
    public boolean deleteById(@PathVariable("uid") Integer uid){
        return  userService.removeById(uid);
    }

    @PostMapping("/add")
    @ApiOperation("添加用户")
    public boolean add(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("/update")
    @ApiOperation("更新用户密码")
    public boolean update(@RequestBody User user){
        return userService.updateById(user);
    }
}

