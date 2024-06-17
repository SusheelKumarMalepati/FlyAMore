package com.in.fam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in.fam.entity.User;
import com.in.fam.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping("/fam/registeruser")
	public ResponseEntity<User> register(@RequestBody User user){
		User u=userService.register(user);
		return new ResponseEntity<User>(u,HttpStatus.CREATED);
	}
	
	@GetMapping("/fam/login/{userEmail}/{userPassword}")
	public ResponseEntity<String> login(@PathVariable String userEmail,@PathVariable String userPassword){
		String ud=userService.login(userEmail,userPassword);
		return new ResponseEntity<String>(ud,HttpStatus.OK);
	}
}
