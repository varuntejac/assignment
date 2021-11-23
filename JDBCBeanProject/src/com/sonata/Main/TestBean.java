package com.sonata.Main;

import java.sql.SQLException;
import java.util.List;
//import java.sql.Timestamp;
//import java.text.SimpleDateFormat;
//import java.sql.Date;

import com.sonata.Model.Notification;
import com.sonata.Model.Task;
import com.sonata.Model.User;

import DAOImplement.DAOImpl;
import DAOImplement.DAONotifImpl;
import DAOImplement.DAOTaskImpl;

public class TestBean {
	public static void main(String args[]) throws SQLException{
		User u1=new User();
		u1.setUser_Id(16);
		u1.setUsername("Varuna");
		u1.setEmail("bhavya789@gmail.com");
		u1.setFirst_Name("varun");
		u1.setLast_Name("chundi");
		u1.setContact_Number(779944222);
		u1.setROLE("traineee");
		u1.setIsActive(true);
		u1.setDOB(null);
		u1.setCreated_On(null);
		u1.setPassword("varun7895");
		
		
		DAOImpl dao=new DAOImpl();
		int row=dao.save(u1);
		System.out.println(row);
		

		List<User> list=dao.getData();
		for(User e:list)
		{
			System.out.println(e.getUser_Id());
			System.out.println(e.getUsername());
			System.out.println(e.getEmail());
			System.out.println(e.getFirst_Name());
			System.out.println(e.getLast_Name());
			System.out.println(e.getContact_Number());
			System.out.println(e.getROLE());
			System.out.println(e.getIsActive());
			System.out.println(e.getDOB());
			System.out.println(e.getCreated_On());
			System.out.println(e.getPassword());
			
		}
		
		int row2=dao.update(u1);
		System.out.println(row2);
		
		int row1=dao.delete(u1);
		System.out.println(row1);
		
	
		Task t1=new Task();
		t1.setTask_Id(77);
		t1.setOwner_Id(u1.getUser_Id());
		t1.setCreator_Id(u1.getUser_Id());
		t1.setName("ramanji");
		t1.setDescription("he is working in wipro at Chennai");
		t1.setStatus("Active");
		t1.setPriority("networkengineer");
		t1.setNotes("notesssssss");
		t1.setIsBookmarked(true);
		t1.setCreated_On(null);
		t1.setStatusChanged_On(null);
		
		DAOTaskImpl dao1=new DAOTaskImpl();
		int row3=dao1.save(t1);
		System.out.println(row3);
		
		List<Task> list1=dao1.getData();
		for(Task t:list1)
		{
			System.out.println(t.getTask_Id());
			System.out.println(t.getOwner_Id());
			System.out.println(t.getCreator_Id());
			System.out.println(t.getName());
			System.out.println(t.getDescription());
			System.out.println(t.getStatus());
			System.out.println(t.getPriority());
			System.out.println(t.getNotes());
			System.out.println(t.getIsBookmarked());
			System.out.println(t.getCreated_On());
			System.out.println(t.getStatusChanged_On());
		}
		
		int row4=dao1.update(t1);
		System.out.println(row4);
		
		int row5=dao1.delete(t1);
		System.out.println(row5);
		
		Notification n1=new Notification();
		n1.setNotification_Id(22);
		n1.setTask_Id(t1.getTask_Id());
		n1.setTask_Owner_Id(u1.getUser_Id());
		n1.setStatus("active");
		n1.setCreated_On(null);
		n1.setStatus_Changed_On(null);
		
		DAONotifImpl dao2=new DAONotifImpl();
		int row6=dao2.Save(n1);
		System.out.println(row6);
		
		List<Notification> list2=dao2.getData();
		for(Notification n:list2)
		{
			System.out.println(n.getNotification_Id());
			System.out.println(n.getTask_Id());
			System.out.println(n.getTask_Owner_Id());
			System.out.println(n.getStatus());
			System.out.println(n.getCreated_On());
			System.out.println(n.getStatus_Changed_On());
		}
		int row7=dao2.update(n1);
		System.out.println(row7);
		
		int row8=dao2.delete(n1);
		System.out.println(row8);
	}

}
