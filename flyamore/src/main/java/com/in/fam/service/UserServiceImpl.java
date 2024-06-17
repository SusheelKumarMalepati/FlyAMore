package com.in.fam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.fam.entity.User;
import com.in.fam.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;
	@Override
	public User register(User user) {
		return userRepository.save(user);
	}
	@Override
	public String login(String userEmail,String userPassword) {
		Optional<User> user=userRepository.findByUserEmailAndUserPassword(userEmail, userPassword);
		if(user.isPresent()) {
			return "loggedin";
		}
		else {
			return "details not found";
		}
	}
}
