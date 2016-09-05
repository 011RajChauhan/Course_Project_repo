package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.models.Project;

@Controller
public class HomeController {
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homePage(Model model){
		Project project = new Project();
		project.setName("First Project");
		project.setSponsor("NASA");
		project.setDescription("This is a simple project sponsored by NASA");
		model.addAttribute("currentProject",project);
		return "home";
	}
}
