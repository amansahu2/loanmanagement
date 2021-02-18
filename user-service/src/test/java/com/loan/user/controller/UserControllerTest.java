package com.loan.user.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.loan.user.controller.UserController;
import com.loan.user.exception.UserNotFoundException;
import com.loan.user.model.User;
import com.loan.user.service.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {

	@Mock
	UserServiceImpl userService;

	@InjectMocks
	UserController userController;

	@Test
	void checkAuthorisedUserTestTrue() {

		User user = new User("admin", "password", true);
		when(userService.checkUser(user)).thenReturn(new ResponseEntity<User>(user, HttpStatus.OK));

		ResponseEntity<User> responseEntity = userController.login(user);

		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

	@Test
	void checkInvalidUserTest() {

		User user = new User("admin", "password", true);
		when(userService.checkUser(user)).thenThrow(new UserNotFoundException());

		ResponseEntity<User> responseEntity = userController.login(user);

		assertEquals(HttpStatus.UNAUTHORIZED, responseEntity.getStatusCode());

	}

	@Test
	void checkAuthorisedUserTestFalse() {

		User user = new User("admin", "password", true);
		when(userService.checkUser(user)).thenReturn(new ResponseEntity<User>(user, HttpStatus.UNAUTHORIZED));

		ResponseEntity<User> responseEntity = userController.login(user);

		assertEquals(HttpStatus.UNAUTHORIZED, responseEntity.getStatusCode());
	}

}
