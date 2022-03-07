package com.org.gen.springmvc.service;

import com.org.gen.springmvc.model.Login;
import com.org.gen.springmvc.model.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
}
