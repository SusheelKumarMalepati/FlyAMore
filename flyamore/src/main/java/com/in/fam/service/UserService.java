package com.in.fam.service;

import org.springframework.stereotype.Component;

import com.in.fam.entity.User;

@Component
public interface UserService {
	public User register(User user);
	public String login(String userEmail,String userPassword);
}
