package com.loan.user.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.loan.user.exception.UserNotFoundException;
import com.loan.user.model.User;
import com.loan.user.repository.UserRepository;
import com.loan.user.service.UserServiceImpl;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

	@Mock
	UserRepository userRepository;
	
	@InjectMocks
	UserServiceImpl userService;


	@Test
	void checkUserTrueTest() {

		User user = new User("admin", "password", true);

		when(userRepository.findByUsername(user.getUsername())).thenReturn(Optional.of(user));

		ResponseEntity<User> responseEntity = userService.checkUser(user);

		assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
	}

	@Test
	void checkUserFalseTest() {

		User user = new User("admin", "password", true);
		when(userRepository.findByUsername(user.getUsername())).thenReturn(Optional.empty());
		try {
			userService.checkUser(user);
		} catch (Exception ex) {
			assertThat(ex).isInstanceOf(UserNotFoundException.class);
		}

	}


}
