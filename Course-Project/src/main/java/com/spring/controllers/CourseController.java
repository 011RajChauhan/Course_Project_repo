package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/project")
public class CourseController {
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addProject(){
		System.out.println("addProject");
		return "project_add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String saveProject(){
		System.out.println("saveProject");
		return "project_add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST,params={"type=mutli"})
	public String saveMultiYearProject(){
		System.out.println("saveMultiYearProject");
		return "project_add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST,params={"type=mutli","special"})
	public String saveSpecialProject(){
		System.out.println("saveSpecialProject");
		return "project_add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST,params={"special"})
	public String saveSpecial2Project(){
		System.out.println("saveSpecial2Project");
		return "project_add";
	}
	
}
