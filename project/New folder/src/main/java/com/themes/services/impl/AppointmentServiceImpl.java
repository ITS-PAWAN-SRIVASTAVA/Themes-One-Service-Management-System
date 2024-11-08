package com.themes.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.themes.models.Appointment;
import com.themes.repository.AppointmentRepository;
import com.themes.services.AppointmentService;


@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	@Autowired
	AppointmentRepository appointmentRepository;

	public AppointmentServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Appointment createAppointmrnt(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointment);
	}

	@Override
	public Appointment getAppointmentWithId(Integer id) {
		// TODO Auto-generated method stub
		return appointmentRepository.getAppointmentWithAppointmentId(id);
	}

	

}
