package com.ktdsuniv.normal.board.service.impl;

import com.ktdsuniv.normal.board.biz.ReplyBiz;
import com.ktdsuniv.normal.board.service.ReplyService;

public class ReplyServiceImpl implements ReplyService {

	private ReplyBiz replyBiz;
	
	public void setReplyBiz(ReplyBiz replyBiz) {
		this.replyBiz = replyBiz;
	}
	
}
