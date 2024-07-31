package com.gana.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gana.backend.model.User;
import com.gana.backend.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:7775")
public class UserController {

	UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/register")
	public String register(@RequestBody User user) {
		User existingUser = userService.findByUserName(user.getUserName());
		if (existingUser != null) {
			return "username already exists";
		}
		userService.saveUser(user);
		return "User registered successfully";
	}

	@PostMapping("/login")
	public String login(@RequestBody User user) {
		User existingUser = userService.findByUserName(user.getUserName());
		if (existingUser != null && user.getPassword().equals(existingUser.getPassword())) {
			return "Login successful";
		} else {
			return "Invalid credentials";
		}
	}
}
