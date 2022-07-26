package com.example.demo220726.service.impl;


import com.example.demo220726.entity.User;
import com.example.demo220726.mapper.UserMapper;
import com.example.demo220726.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}


