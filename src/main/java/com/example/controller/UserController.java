package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/page")
    public PageInfo<User> page(){
        PageInfo<User> page = service.page();
        return page;
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        User user = service.findById(id);
        int a = 1/0;
        return user;
    }

    @PostMapping
    public void findAll(@RequestBody User user){
        service.add(user);
    }

    @PutMapping
    public void update(@RequestBody User user){
        service.update(user);
    }

    @DeleteMapping("/{id}")
    public void del(@PathVariable Integer id){
        service.del(id);
    }
}
