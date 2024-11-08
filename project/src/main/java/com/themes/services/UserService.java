package com.themes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.themes.models.User;
import com.themes.repository.UserRepository;

@Service
public class UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	public List<User> getUsers()
	{
		return userRepository.findAll();
	}
	
	
	public Optional<User> getUserByEmail(String email)
	{
		
		
		return userRepository.findByEmail(email);
	}
	
	public User createUser(User user)
	{
		
		
		String username = user.getEmail();
		
		user.setUsername(username);
	
		
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		return userRepository.save(user);
	}
}
