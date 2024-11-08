package com.themes;

import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.themes.models.User;
import com.themes.repository.UserRepository;
import com.themes.services.SendMailService;





@SpringBootApplication
public class ThemesOneApplication {	

	@Autowired
	private SendMailService sendMail;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(ThemesOneApplication.class, args);	
		
		
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void send()
	{	
		

		
		Random rnd = new Random();
	    int number = rnd.nextInt(999999);
	    
	    
	      //String body = String.format("%06d", number);
	      System.out.println("Application started...");
		
	}
	
	
    @Bean
    WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200");
			}
	};
 }	
    
}



