package com.github.security.service.serviceImpl;

import com.github.security.dao.UserDao;
import com.github.security.domain.User;
import com.github.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById() {
        return userDao.getByUserId(1);
    }
}
