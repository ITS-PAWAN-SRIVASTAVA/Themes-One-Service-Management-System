package com.themes.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class ProjectServiceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer projectServiceId;
	private Integer serviceId;
	private Integer projectId;
	
	
	public ProjectServiceDetails() {
		// TODO Auto-generated constructor stub
		
	}


	public ProjectServiceDetails(Integer projectServiceId, Integer serviceId, Integer projectId) {
		super();
		this.projectServiceId = projectServiceId;
		this.serviceId = serviceId;
		this.projectId = projectId;
	}


	public Integer getProjectServiceId() {
		return projectServiceId;
	}


	public void setProjectServiceId(Integer projectServiceId) {
		this.projectServiceId = projectServiceId;
	}


	public Integer getServiceId() {
		return serviceId;
	}


	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}


	public Integer getProjectId() {
		return projectId;
	}


	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}


	
}
