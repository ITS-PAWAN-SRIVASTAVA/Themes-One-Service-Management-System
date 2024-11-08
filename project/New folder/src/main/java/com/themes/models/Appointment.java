package com.themes.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	private String aFirstname;
	private String aLastname;
	private String aEmail;
	private String aPhoneNumber;
	private String aCity;
	private String aState;
	private String aStreetAddress;
	private String aZipCode;
	private Date createdDate;
	private String aWorkingTime;
	private String aWorkType;
	private String status;
	private Integer aUserId;
	
	
	
	

	

}
