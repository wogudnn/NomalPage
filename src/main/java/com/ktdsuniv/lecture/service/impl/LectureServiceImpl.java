package com.ktdsuniv.lecture.service.impl;

import java.util.List;

import com.ktdsuniv.lecture.biz.LectureBiz;
import com.ktdsuniv.lecture.schema.LectureListSchema;
import com.ktdsuniv.lecture.schema.SearchLectureSchema;
import com.ktdsuniv.lecture.service.LectureService;

import lecture.schema.LecturesSchema;

public class LectureServiceImpl implements LectureService {

	private LectureBiz lectureBiz;
	
	public void setLectureBiz(LectureBiz lectureBiz) {
		this.lectureBiz = lectureBiz;
	}
	
	@Override
	public LectureListSchema getAllLectureList(SearchLectureSchema searchLectureSchema) {
		return lectureBiz.getAllLectureList(searchLectureSchema);
	}
}
