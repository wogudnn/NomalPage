package com.ktdsuniv.normal.room.web;

import org.springframework.stereotype.Controller;

import com.ktdsuniv.normal.room.service.impl.SeatServiceImpl;

@Controller
public class SeatController {

	private SeatServiceImpl seatService;

	public void setSeatService(SeatServiceImpl seatService) {
		this.seatService = seatService;
	}

}
