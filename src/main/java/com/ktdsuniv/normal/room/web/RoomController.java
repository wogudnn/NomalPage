package com.ktdsuniv.normal.room.web;

import org.springframework.stereotype.Controller;

import com.ktdsuniv.normal.room.service.RoomService;

@Controller
public class RoomController {

	
	private RoomService roomService;

	public RoomService getRoomService() {
		return roomService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	

	
}
