package com.ktdsuniv.normal.user.biz.impl;

import com.ktdsuniv.normal.user.biz.UserBiz;
import com.ktdsuniv.normal.user.dao.UserDao;

public class UserBizImpl implements UserBiz {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
