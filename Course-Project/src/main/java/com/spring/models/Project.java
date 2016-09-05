package com.spring.models;

import java.math.BigDecimal;

public class Project {
	
	private int projectId;
	
	private String name;
	
	private String description;
	
	private String sponsor;
	
	private int authorizedHours;	
	
	private int authorizedFunds;
	
	private String year;
	
	private boolean special;
	
	private String type;
	
	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public int getAuthorizedHours() {
		return authorizedHours;
	}

	public void setAuthorizedHours(int k) {
		this.authorizedHours = k;
	}

	public int getAuthorizedFunds() {
		return authorizedFunds;
	}

	public void setAuthorizedFunds(int j) {
		this.authorizedFunds = j;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public boolean isSpecial() {
		return special;
	}

	public void setSpecial(boolean special) {
		this.special = special;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
}
