package com.ktdsuniv.normal.lecture.web;

import org.springframework.stereotype.Controller;

import com.ktdsuniv.normal.lecture.service.LectureService;

@Controller
public class LectureController {

	private LectureService lectureService;
	
	public void setLectureService(LectureService lectureService) {
		this.lectureService = lectureService;
	}
	
}
