package com.ktdsuniv.normal.user.service.impl;

import com.ktdsuniv.normal.user.biz.UserBiz;
import com.ktdsuniv.normal.user.service.UserService;

public class UserServiceImpl implements UserService {

	private UserBiz userBiz;
	
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
}
