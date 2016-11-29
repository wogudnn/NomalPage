package com.ktdsuniv.lecture.service;

import java.util.List;

import com.ktdsuniv.lecture.schema.LectureListSchema;
import com.ktdsuniv.lecture.schema.SearchLectureSchema;

import lecture.schema.LecturesSchema;

public interface LectureService {

	public LectureListSchema getAllLectureList(SearchLectureSchema searchLectureSchema);

}
