package com.themes.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer projectId;
	
	private Date pCreatedDate;
	private String pSerialNo;
	private Integer userId;
	
	
	
	
	public Project() {
		// TODO Auto-generated constructor stub
	}




	public Project(Integer projectId, Date pCreatedDate, String pSerialNo, Integer userId) {
		super();
		this.projectId = projectId;
		this.pCreatedDate = pCreatedDate;
		this.pSerialNo = pSerialNo;
		this.userId = userId;
	}




	public Integer getProjectId() {
		return projectId;
	}




	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}




	public Date getpCreatedDate() {
		return pCreatedDate;
	}




	public void setpCreatedDate(Date pCreatedDate) {
		this.pCreatedDate = pCreatedDate;
	}




	public String getpSerialNo() {
		return pSerialNo;
	}




	public void setpSerialNo(String pSerialNo) {
		this.pSerialNo = pSerialNo;
	}




	public Integer getUserId() {
		return userId;
	}




	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	

}
