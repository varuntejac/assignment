package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public interface UserValidationInterface {
	public boolean validateUser(String username,String password);
	public int save(Object object);
	
}
