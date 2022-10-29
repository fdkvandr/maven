package com.corp.service.service;

import com.corp.database.dao.UserDao;
import com.corp.service.dto.UserDto;

import java.util.Optional;

public class UserService {
    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser (Long id) {
        return userDao.findById(id).map(it -> new UserDto());
    }

}
