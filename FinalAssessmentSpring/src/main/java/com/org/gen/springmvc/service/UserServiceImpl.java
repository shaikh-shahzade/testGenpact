package com.org.gen.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.gen.springmvc.dao.UserDao;
import com.org.gen.springmvc.model.Login;
import com.org.gen.springmvc.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

}
