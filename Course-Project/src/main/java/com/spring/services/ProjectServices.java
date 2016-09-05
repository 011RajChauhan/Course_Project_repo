package com.spring.services;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.spring.models.Project;

public class ProjectServices {
	List<Project> projects = new LinkedList<>();
	
	public ProjectServices(){
		Project javaProject = createProject("Java Project","HCL Technologies LTD.", "Sponsor of the java project is HCL Technologies LTD.");
		Project javaScriptProject = createProject("Java Script Project","TCS", "Sponsor of the java script project is TCS.");
		Project strutsProject = createProject("Struts Project","KMG", "Sponsor of the struts project is KMG.");
		this.projects.addAll(Arrays.asList(new Project[]{javaProject,javaScriptProject,strutsProject}));
	}
	
	public Project createProject(String name,String sponsor,String description){
		Project project = new Project();
		project.setName(name);
		project.setSponsor(sponsor);
		project.setDescription(description);
		return project;
	}
	public List<Project> findAll(){
		return projects;
	}
}
