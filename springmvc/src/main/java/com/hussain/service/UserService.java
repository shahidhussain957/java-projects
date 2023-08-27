package com.hussain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hussain.controller.User;
import com.hussain.dao.UserDao;
//The class will know that this is service class
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
public int createUser(User user) {
	return this.userDao.saveUser(user);
}
}
