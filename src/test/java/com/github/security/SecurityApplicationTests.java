package com.github.security;

import com.github.security.service.UserService;
import com.github.security.service.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SecurityApplicationTests {


	@Autowired
	UserService userService;

	@Test
	void contextLoads() {
	}

	@Test
	public void test(){
		System.out.println(userService.getUserById());
	}
}
