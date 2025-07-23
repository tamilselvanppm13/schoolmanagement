package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Userentity;
import com.example.demo.repository.Userrepo;

@RestController
public class Authcontroller {
@Autowired
private Userrepo repo;
	
@PostMapping("/register")

public String register(@RequestBody Userentity user) {
	if (repo.findByEmail(user.getEmail()) !=null){
		return "Email already registered";
	}
	repo.save(user);
	return "User registered successfully";
	
}
@PostMapping("/login")

public String login(@RequestBody Userentity loginUser) {
	Userentity user=repo.findByEmail(loginUser.getEmail());
	if(user == null) {
		return "User not found!";
	}
	if (!user.getPassword().equals(loginUser.getPassword())) {
		return "Invalid password!";
	}
	return "Login successfully";
}

}
