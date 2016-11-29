package com.ktdsuniv.project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ktdsuniv.project.service.ProjectService;

@Controller
//@RequestMapping("/project")
public class ProjectController {

	private ProjectService projectService;
	
	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}
	
	@RequestMapping("/project")
	public ModelAndView viewProjectPage(){
		ModelAndView view = new ModelAndView();
		view.setViewName("project/project");
		return view;
	}
}
