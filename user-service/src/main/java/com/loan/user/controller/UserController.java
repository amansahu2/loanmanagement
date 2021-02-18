package com.loan.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.user.exception.UserNotFoundException;
import com.loan.user.model.User;
import com.loan.user.service.UserService;
import com.loan.user.service.UserServiceImpl;


@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/login")
	public ResponseEntity<User> login(@RequestBody User user){
		ResponseEntity<User> responseEntity;
				try{
					responseEntity= userService.checkUser(user);
					}
				catch(UserNotFoundException ex) {
					return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
				}

				return responseEntity;
	}
	
}
