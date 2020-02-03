package com.blue.service;

import com.blue.dao.UserDao;


public class UserServiecImpl implements UserService {
    private UserDao UD;
    public void setUserDao(UserDao userDao){
        this.UD = userDao;
    }
    public void getUser(){
        UD.getUser();
    }
}
