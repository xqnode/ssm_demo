package com.example.controller;

import com.example.service.UserService;
import com.example.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService service;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        System.out.println("success");
        List<User> all = service.findAll();
        return all;
    }
}
