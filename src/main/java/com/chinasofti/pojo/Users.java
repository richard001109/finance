package com.chinasofti.pojo;

import java.util.Date;

/**
 * 用户实体类对象，与数据库中的tb_user表对应
 * */
public class Users {
    private int userId;
    private String userName;
    private String password;
    private String userNickName;
    private String email;
    private String personalProfile;
    private Date CreateTime;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonalProfile() {
        return personalProfile;
    }

    public void setPersonalProfile(String personalProfile) {
        this.personalProfile = personalProfile;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userNickName='" + userNickName + '\'' +
                ", email='" + email + '\'' +
                ", personalProfile='" + personalProfile + '\'' +
                ", CreateTime=" + CreateTime +
                '}';
    }
}
