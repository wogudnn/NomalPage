package com.ktdsuniv.normal.room.biz.impl;

import com.ktdsuniv.normal.room.biz.SeatBiz;
import com.ktdsuniv.normal.room.dao.SeatDao;

public class SeatBizImpl implements SeatBiz {

	private SeatDao seatDao;
	
	public void setSeatDao(SeatDao seatDao) {
		this.seatDao = seatDao;
	}
	
}
