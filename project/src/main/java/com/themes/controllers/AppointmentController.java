package com.themes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.themes.models.Appointment;
import com.themes.services.AppointmentService;

@RestController
@RequestMapping("/apt")
public class AppointmentController {

	@Autowired
	AppointmentService appointmentService;

	@PostMapping("/create-appointment")
	public Appointment saveAppointment(@RequestBody Appointment appointment) {
		return appointmentService.createAppointmrnt(appointment);

	}

	@GetMapping("/getApt")
	public Appointment getAppointment(Integer id) {
		return appointmentService.getAppointmentWithId(id);
	}

	@GetMapping("/{userId}")
	public Appointment getAppointmentWithAppointmentId(@PathVariable("userId") Integer id) {
		return appointmentService.getAppointmentWithId(id);
	}

}
