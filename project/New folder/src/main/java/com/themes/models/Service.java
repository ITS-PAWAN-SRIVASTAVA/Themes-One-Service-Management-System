package com.themes.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Service {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer serviceId;
	
	private String serviceName;
	
	public Service() {
		// TODO Auto-generated constructor stub
	}

	public Service(Integer serviceId, String serviceName) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
	}

	public Integer getServiceId() {
		return serviceId;
	}

	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	
	

}
