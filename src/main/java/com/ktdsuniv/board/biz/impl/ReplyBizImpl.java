package com.ktdsuniv.board.biz.impl;

import com.ktdsuniv.board.biz.ReplyBiz;
import com.ktdsuniv.board.dao.ReplyDao;

public class ReplyBizImpl implements ReplyBiz {

	private ReplyDao replyDao;
	
	public void setReplyDao(ReplyDao replyDao) {
		this.replyDao = replyDao;
	}
	
}
