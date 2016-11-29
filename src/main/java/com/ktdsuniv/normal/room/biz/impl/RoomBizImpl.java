package com.ktdsuniv.normal.room.biz.impl;

import com.ktdsuniv.normal.room.biz.RoomBiz;
import com.ktdsuniv.normal.room.dao.RoomDao;

public class RoomBizImpl implements RoomBiz {

	private RoomDao roomDao;

	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

}
