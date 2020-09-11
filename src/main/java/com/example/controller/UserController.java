package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService service;

    @GetMapping("/findAll")
    public List<User> findAll(){
        List<User> all = service.findAll();
        return all;
    }

    @GetMapping("/{id}")
    public User findAll(@PathVariable Integer id){
        User user = service.findById(id);
        return user;
    }
}
