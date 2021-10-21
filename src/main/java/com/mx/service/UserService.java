package com.mx.service;

import com.mx.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public void test(){
        System.out.println("userservice...");
        userDao.test();
    }
}
