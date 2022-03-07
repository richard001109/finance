package com.chinasofti.dao;

import com.chinasofti.pojo.Users;
import org.springframework.stereotype.Repository;

/**
 * 数据访问接口
 */
@Repository
public interface UserDao {
    //用户登录
    public Users login(Users users);
}
