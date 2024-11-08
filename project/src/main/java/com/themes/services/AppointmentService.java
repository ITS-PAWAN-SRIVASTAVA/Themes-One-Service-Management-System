package com.themes.services;

import org.springframework.stereotype.Service;

import com.themes.models.Appointment;

@Service
public interface AppointmentService {

	public Appointment createAppointmrnt(Appointment appointment);
	
	public Appointment getAppointmentWithId(Integer id);

	
	
}
