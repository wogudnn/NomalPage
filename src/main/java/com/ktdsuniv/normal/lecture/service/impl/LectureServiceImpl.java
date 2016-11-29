package com.ktdsuniv.normal.lecture.service.impl;

import com.ktdsuniv.normal.lecture.biz.LectureBiz;
import com.ktdsuniv.normal.lecture.service.LectureService;

public class LectureServiceImpl implements LectureService {

	private LectureBiz lectureBiz;
	
	public void setLectureBiz(LectureBiz lectureBiz) {
		this.lectureBiz = lectureBiz;
	}
	
}
