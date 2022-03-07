package com.chinasofti.service.impl;

import com.chinasofti.dao.UserDao;
import com.chinasofti.pojo.Users;
import com.chinasofti.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 业务逻辑接口层的实现类
 */
@Service
public class UserServiceImpl implements UserService {
    //注入UserDao实例
    @Autowired
    private UserDao userDao;

    @Override
    public Users login(Users users) {
        return userDao.login(users);
    }

}
