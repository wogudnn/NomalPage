package com.ktdsuniv.normal.project.biz.impl;

import com.ktdsuniv.normal.project.biz.ProjectBiz;
import com.ktdsuniv.normal.project.dao.ProjectDao;

public class ProjectBizImpl implements ProjectBiz {

	private ProjectDao projectDao;
	
	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}
	
}
