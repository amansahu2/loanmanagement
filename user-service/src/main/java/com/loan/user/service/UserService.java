package com.loan.user.service;

import org.springframework.http.ResponseEntity;

import com.loan.user.model.User;


public interface UserService {

	ResponseEntity<User> checkUser(User user);
	
}
