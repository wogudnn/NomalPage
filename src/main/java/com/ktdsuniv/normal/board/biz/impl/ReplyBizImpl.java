package com.ktdsuniv.normal.board.biz.impl;

import com.ktdsuniv.normal.board.biz.ReplyBiz;
import com.ktdsuniv.normal.board.dao.ReplyDao;

public class ReplyBizImpl implements ReplyBiz {

	private ReplyDao replyDao;
	
	public void setReplyDao(ReplyDao replyDao) {
		this.replyDao = replyDao;
	}
	
}
