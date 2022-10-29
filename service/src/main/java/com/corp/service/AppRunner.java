package com.corp.service;

import com.corp.database.dao.UserDao;
import com.corp.database.entity.UserEntity;

import java.util.Optional;

public class AppRunner {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        UserDao userDao = new UserDao();
        Optional<UserEntity> byId = userDao.findById(1L);
        System.out.println(byId);
    }

}
