package com.ktdsuniv.normal.room.service.impl;

import com.ktdsuniv.normal.room.biz.RoomBiz;
import com.ktdsuniv.normal.room.service.RoomService;

public class RoomServiceImpl implements RoomService {

	private RoomBiz roomBiz;

	public void setRoomBiz(RoomBiz roomBiz) {
		this.roomBiz = roomBiz;
	}
	
	
}
