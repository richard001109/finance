package com.chinasofti.service;

import com.chinasofti.pojo.Users;

/**
 * 业务逻辑接口层
 */

public interface UserService {
    //登陆的方法
    public Users login(Users users);
}
