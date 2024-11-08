package com.themes.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;
import com.themes.models.User;
import com.themes.models.UserWithDetails;




public interface UserRepository extends JpaRepository<User,Integer>{
	
	
	
	public Optional<User> findByEmail(String email);
	
	public Optional<User> findByEmailAndPassword(String email,String password);
	
	
	
}
