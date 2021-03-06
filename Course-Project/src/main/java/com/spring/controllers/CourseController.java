package com.spring.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.models.Project;
import com.spring.services.ProjectServices;

@Controller
@RequestMapping(value="/project")
public class CourseController {
	
	@Autowired
	private ProjectServices projectServices;
	
	@RequestMapping(value="{projectId}")
	public String find(Model model,@PathVariable("projectId") int projectId){
		System.out.println("invoking /project/{projectId} >>> find()");
		model.addAttribute("project",this.projectServices.find(projectId));
		return "project";
	}
	
	/*same URL mapping name used for different type of 
	action to be executed according to the parameter 
	obtained from the form*/
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String addProject(HttpSession session){
		session.setAttribute("user","rajan");
		System.out.println("invoking addProject()");
		return "project_add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String saveProject(@ModelAttribute Project project){
		System.out.println("invoking saveProject()");
		System.out.println(project);
		/*System.out.println(request.getParameter("name"));
		System.out.println(session.getAttribute("user"));*/
		return "project_add";
	}
	
	/*commenting demo methods of saving project, which executes based
	on parmeter basis
	*/
	
	
	/*@RequestMapping(value="/add",method=RequestMethod.POST,params={"type=mutli"})
	public String saveMultiYearProject(){
		System.out.println("invoking saveMultiYearProject()");
		return "project_add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST,params={"type=mutli","special"})
	public String saveSpecialProject(){
		System.out.println("invoking saveSpecialProject()");
		return "project_add";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST,params={"special"})
	public String saveSpecial2Project(){
		System.out.println("invoking saveSpecial2Project()");
		return "project_add";
	}*/
	
	
	@RequestMapping(value="/find",method=RequestMethod.GET)
	public String find(Model model){
		System.out.println("invoking find() for all projects");
		model.addAttribute("projects",projectServices.findAll());
		return "projects";
	}


	
	
	
}
