package com.ktdsuniv.normal.board.biz.impl;

import com.ktdsuniv.normal.board.biz.BoardBiz;
import com.ktdsuniv.normal.board.dao.BoardDao;

public class BoardBizImpl implements BoardBiz {

	private BoardDao boardDao;
	
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
}
