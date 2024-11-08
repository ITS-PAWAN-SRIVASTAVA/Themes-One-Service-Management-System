package com.themes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reset-password")
public class UserResetPasswordController {
	
	@GetMapping("/reset")
	public String getReset() {
		
		return "reset successfully";
		
	}

}
