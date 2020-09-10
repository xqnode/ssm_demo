package com.example;

import com.example.dao.UserDao;
import com.example.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestUser {
    @Test
    public void findAll() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserDao userDao = ac.getBean(UserDao.class); // 因为给service起了别名，所以通过id的方式获取class
        List<User> all = userDao.findAll();
        System.out.println(all);
    }
}
