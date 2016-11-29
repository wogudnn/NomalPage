package com.ktdsuniv.normal.room.service.impl;

import com.ktdsuniv.normal.room.biz.SeatBiz;
import com.ktdsuniv.normal.room.service.SeatService;

public class SeatServiceImpl implements SeatService {

	private SeatBiz seatBiz;
	
	public void setSeatBiz(SeatBiz seatBiz) {
		this.seatBiz = seatBiz;
	}
	
}
