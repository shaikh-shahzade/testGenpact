package com.org.gen.springmvc.dao;

import com.org.gen.springmvc.model.Login;
import com.org.gen.springmvc.model.User;

public interface UserDao {

  int register(User user);

  User validateUser(Login login);
}
