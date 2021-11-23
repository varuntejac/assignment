package com.example.demo.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.example.Bean.DbConnection;
import com.example.Bean.Task;
import com.example.Bean.User;
import com.example.demo.UserValidationInterface;
@SpringBootApplication
@Component
public class DefaultUserValidation implements UserValidationInterface {
	boolean status=false;
	DbConnection db=new DbConnection();
	User user=null;
	Task task=null;
	int row3=0;
	
	@Override
	public boolean validateUser(String username, String password) {
		try {
			PreparedStatement cs= db.getConnection().prepareStatement
					("select * from user where Username=? and Password=?");
			cs.setString(1,username);
			cs.setString(2,password);
			ResultSet rs=cs.executeQuery();
			/*while(rs.next())
			{
				if(password.equals(rs.getString("Password")))
				{
					return status=true;
				}
				else {
					return status=false;
				}
			}*/
			status=rs.next();
			db.closeConnection();
		}catch(SQLException e) {System.out.println(e);}
		return status;
	}
	public int save(Object object)
	{
		try {
			task=(Task)object;
			PreparedStatement cs= db.getConnection().prepareStatement
					("insert into TASK values(?,?,?,?,?,?,?,?,?,?,?)");
			cs.setInt(1,task.getTask_Id());
			cs.setInt(2, task.getOwner_Id());
			cs.setInt(3,task.getCreator_Id());
			cs.setString(4, task.getName());
			cs.setString(5, task.getDescription());
			cs.setString(6, task.getStatus());
			cs.setString(7, task.getPriority());
			cs.setString(8, task.getNotes());
			cs.setBoolean(9, task.getIsBookmarked());
			cs.setTimestamp(10, task.getCreated_On());
			cs.setTimestamp(11,task.getStatusChanged_On() );
			row3=cs.executeUpdate();
			db.closeConnection();
		}catch(SQLException e) {System.out.println(e);}
		return row3;
	}
	
	

}
