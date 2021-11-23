package com.sonata.Model;

import java.sql.Timestamp;

public class Notification {
	private int Notification_Id;
	private int Task_Id;
	private int Task_Owner_Id;
	private String Status;
	private Timestamp Created_On;
	private Timestamp Status_Changed_On;
	public int getNotification_Id() {
		return Notification_Id;
	}
	public void setNotification_Id(int notification_Id) {
		Notification_Id = notification_Id;
	}
	public int getTask_Id() {
		return Task_Id;
	}
	public void setTask_Id(int task_Id) {
		Task_Id = task_Id;
	}
	public int getTask_Owner_Id() {
		return Task_Owner_Id;
	}
	public void setTask_Owner_Id(int task_Owner_Id) {
		Task_Owner_Id = task_Owner_Id;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Timestamp getCreated_On() {
		return Created_On;
	}
	public void setCreated_On(Timestamp created_On) {
		Created_On = created_On;
	}
	public Timestamp getStatus_Changed_On() {
		return Status_Changed_On;
	}
	public void setStatus_Changed_On(Timestamp status_Changed_On) {
		Status_Changed_On = status_Changed_On;
	}
	
	

}
