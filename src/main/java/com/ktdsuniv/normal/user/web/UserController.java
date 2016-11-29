package com.ktdsuniv.normal.user.web;

import org.springframework.stereotype.Controller;

import com.ktdsuniv.normal.user.service.UserService;

@Controller
public class UserController {

	
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
