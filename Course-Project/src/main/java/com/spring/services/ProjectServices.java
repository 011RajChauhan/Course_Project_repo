package com.spring.services;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.spring.models.Project;

public class ProjectServices {
	List<Project> projects = new LinkedList<>();
	
	public ProjectServices(){
		Project javaProject = createProject(1,"Java Project","HCL Technologies LTD.", "Sponsor of the java project is HCL Technologies LTD.",100000,1000,"multi","1999");
		Project javaScriptProject = createProject(2,"Java Script Project","TCS", "Sponsor of the java script project is TCS.",105600,1100,"multi","2006");
		Project strutsProject = createProject(3,"Struts Project","KMG", "Sponsor of the struts project is KMG.",1056800,1200,"multi","2016");
		this.projects.addAll(Arrays.asList(new Project[]{javaProject,javaScriptProject,strutsProject}));
	}
	
	public Project createProject(int i,String name,String sponsor,String description,int j,int k,String type,String year){
		Project project = new Project();
		project.setProjectId(i);
		project.setName(name);
		project.setSponsor(sponsor);
		project.setDescription(description);
		project.setAuthorizedFunds(j);
		project.setAuthorizedHours(k);
		project.setType(type);
		project.setYear(year);
		
		return project;
	}
	public List<Project> findAll(){
		return projects;
	}

	/*public Project find(Long projectId) {
		return this.projects.stream().filter(p -> {
			return p.getProjectId().equals(projectId);
			}).collect(Collectors.toList()).get(0);
	}*/
	public Project find(int projectId){
		Project project = null;
		for(Project projectLocal:projects){
			if(projectLocal.getProjectId()==projectId){
				project=projectLocal;
			}
		}
		return project;
	}
}
