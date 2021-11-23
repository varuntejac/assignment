package com.example.demo;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Bean.Task;
@SpringBootApplication
@Controller
public class HelloController {
	
	@Autowired
	UserValidationInterface DefaultUserValidation;
	
	
	@RequestMapping("/login")
	public String showLogin() {
		
		return "login";
	}
	@RequestMapping(path ="/login",method=RequestMethod.POST)
	public String validateUser(@RequestParam("username") String username,@RequestParam("password") String password, Model model) {	
		boolean check=DefaultUserValidation.validateUser(username,password);
		
		if(check==true)
		{
			
			return "home";
		}
		else {
		
			return "error";
		}
		
	}
	
	@RequestMapping("/login1")
	public String showLogin1() {
		
		return "login1";
	}
	@RequestMapping(path ="/login1",method=RequestMethod.POST)
	public String save(@RequestParam("taskid") String taskid,@RequestParam("name") String name,@RequestParam("description") String description,@RequestParam("status") String status,@RequestParam("priority") String priority,@RequestParam("notes") String notes,@RequestParam("bookmark") boolean bookmark,@RequestParam("ownerid") String ownerid,@RequestParam("creatorid") String creatorid,@RequestParam("createdon") Timestamp createdon,@RequestParam("modifiedon") Timestamp modifiedon, Model model) {	
		Task t1=new Task();
		t1.setTask_Id(Integer.parseInt(taskid));
		t1.setOwner_Id(Integer.parseInt(ownerid));
		t1.setCreator_Id(Integer.parseInt(creatorid));
		t1.setName(name); 
		t1.setDescription(description);
		t1.setStatus(status);
		t1.setPriority(priority);
		t1.setNotes(notes);
		t1.setIsBookmarked(bookmark);
		t1.setCreated_On(createdon);
		t1.setStatusChanged_On(modifiedon);
		int check1=DefaultUserValidation.save(t1);
		
		if(check1>0)
		{
			
			return "home1";
		}
		else {
		
			return "error1";
		}
	}
	
}
