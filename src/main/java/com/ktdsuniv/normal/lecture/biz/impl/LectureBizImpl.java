package com.ktdsuniv.normal.lecture.biz.impl;

import com.ktdsuniv.normal.lecture.biz.LectureBiz;
import com.ktdsuniv.normal.lecture.dao.LectureDao;

public class LectureBizImpl implements LectureBiz {

	private LectureDao lectureDao;
	
	public void setLectureDao(LectureDao lectureDao) {
		this.lectureDao = lectureDao;
	}
	
}
