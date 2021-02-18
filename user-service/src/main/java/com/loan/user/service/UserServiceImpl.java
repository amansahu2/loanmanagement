package com.loan.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.loan.user.exception.UserNotFoundException;
import com.loan.user.model.User;
import com.loan.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public ResponseEntity<User> checkUser(User user) {

		Optional<User> user1 = userRepository.findByUsername(user.getUsername());

		if (!user1.isEmpty() && user1.get().getPassword().equals(user.getPassword())) {
			return new ResponseEntity<>(user1.get(), HttpStatus.OK);

		}
		throw new UserNotFoundException("User with given credentials are not found");

	}

}
