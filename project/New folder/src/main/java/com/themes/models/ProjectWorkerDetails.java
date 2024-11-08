package com.themes.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProjectWorkerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer workerId;
	private Integer ProjectId;
	
	
	public ProjectWorkerDetails() {
		// TODO Auto-generated constructor stub
	}


	public ProjectWorkerDetails(Integer id, Integer workerId, Integer projectId) {
		super();
		this.id = id;
		this.workerId = workerId;
		ProjectId = projectId;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getWorkerId() {
		return workerId;
	}


	public void setWorkerId(Integer workerId) {
		this.workerId = workerId;
	}


	public Integer getProjectId() {
		return ProjectId;
	}


	public void setProjectId(Integer projectId) {
		ProjectId = projectId;
	}
	
	

}
