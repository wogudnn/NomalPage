package com.ktdsuniv.normal.board.web;

import org.springframework.stereotype.Controller;

import com.ktdsuniv.normal.board.service.BoardService;

@Controller
public class BoardController {

	private BoardService boardService;
	
	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}
	
}
