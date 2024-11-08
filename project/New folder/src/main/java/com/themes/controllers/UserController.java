package com.themes.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.themes.models.User;
import com.themes.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	UserService userService;
	
	
	@PostMapping("/getUserWithEmail")
	public Optional<User> getUserWithEmail(@RequestHeader String email)
	{
		return userService.getUserByEmail(email);
	}
	
}
