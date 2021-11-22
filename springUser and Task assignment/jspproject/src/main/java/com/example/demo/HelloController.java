package com.example.demo;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Bean.Task;
@Controller
public class HelloController {
	
	@Autowired
	UserValidationInterface DefaultUserValidation;
	
	
	
	@RequestMapping(value ="/login",method=RequestMethod.GET)
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
	@RequestMapping("/login")
	public String showLogin() {
		
		return "login";
	}
	@RequestMapping(value ="/login1",method=RequestMethod.GET)
	public String save(@RequestParam("taskid") int taskid,@RequestParam("name") String name,@RequestParam("description") String description,@RequestParam("status") String status,@RequestParam("priority") String priority,@RequestParam("notes") String notes,@RequestParam("bookmark") boolean bookmark,@RequestParam("ownerid") int ownerid,@RequestParam("creatorid") int creatorid,@RequestParam("createdon") Timestamp createdon,@RequestParam("modifiedon") Timestamp modifiedon, Model model) {	
		Task t1=new Task();
		t1.setTask_Id(taskid);
		t1.setOwner_Id(ownerid);
		t1.setCreator_Id(creatorid);
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
	@RequestMapping("/login1")
	public String showLogin1() {
		
		return "login1";
	}
}
