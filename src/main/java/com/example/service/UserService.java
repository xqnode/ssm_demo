package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.selectAll();
    }

    public User findById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    public PageInfo<User> page() {
        PageHelper.startPage(1, 5);
        List<User> all = findAll();
        return PageInfo.of(all);
    }

    public void add(User user) {
        userDao.insertSelective(user);
    }

    public void update(User user) {
        userDao.updateByPrimaryKeySelective(user);
    }

    public void del(Integer id) {
        userDao.deleteByPrimaryKey(id);
    }
}
