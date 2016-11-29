package com.ktdsuniv.normal.board.service.impl;

import com.ktdsuniv.normal.board.biz.BoardBiz;
import com.ktdsuniv.normal.board.service.BoardService;

public class BoardServiceImpl implements BoardService {

	private BoardBiz boardBiz;
	
	public void setBoardBiz(BoardBiz boardBiz) {
		this.boardBiz = boardBiz;
	}
	
}
