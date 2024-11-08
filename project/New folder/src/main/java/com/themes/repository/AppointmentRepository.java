package com.themes.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.themes.models.Appointment;
import com.themes.models.User;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{

	@Query(value="select * from appointment", nativeQuery=true)
	public List<Appointment> getAppointment();
	
	
	@Query(value="SELECT * FROM themes_interior_db.appointment where id=1", nativeQuery=true)
	public Appointment getAppointmentWithId();
	
	@Query(value="SELECT * FROM themes_interior_db.appointment apt where apt.id=:id", nativeQuery=true)
	public Appointment getAppointmentWithAppointmentId(@Param("id") Integer id);
	
	
}
