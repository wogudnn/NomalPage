package com.ktdsuniv.normal.project.service.impl;

import com.ktdsuniv.normal.project.biz.ProjectBiz;
import com.ktdsuniv.normal.project.service.ProjectService;

public class ProjectServiceImpl implements ProjectService{

	private ProjectBiz projectBiz;
	
	public void setProjectBiz(ProjectBiz projectBiz) {
		this.projectBiz = projectBiz;
	}
	
}
