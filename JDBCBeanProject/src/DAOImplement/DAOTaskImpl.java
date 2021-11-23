package DAOImplement;

import java.sql.Timestamp;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.Dao.DaoTaskInter;
import com.sonata.Model.Task;

public class DAOTaskImpl implements DaoTaskInter {
	int row3=0;
	int row4;
	int row5;
	DbConnection db=new DbConnection();
	Task task=null;
	
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
	@Override
	public int update(Object object)
	{
		try {
			task=(Task)object;
			PreparedStatement cs2=db.getConnection().prepareStatement("update Task set Name=?  where Task_Id=?");
			cs2.setString(1,"Bhavya");
			cs2.setInt(2,1);
			row4=cs2.executeUpdate();
			System.out.println("this number of updated records  are "+row4);
			db.closeConnection();
		}catch(SQLException e) {System.out.println(e);}
		return row4;
		
	}
	@Override
	public int delete(Object object)
	{
		try {
			task=(Task)object;
			PreparedStatement cs2=db.getConnection().prepareStatement("delete from task where Task_Id=?");
			cs2.setInt(1,2);
			row5=cs2.executeUpdate();
			System.out.println("this number of records deleted are "+row5);
			db.closeConnection();
		}catch(SQLException e) {System.out.println(e);}
		return row5;
	}
		@Override 
		public List<Task> getData(){
		List<Task> taskList=new ArrayList<>();
		try {
			PreparedStatement cs1=db.getConnection().prepareStatement("select * from task");
			ResultSet rs=cs1.executeQuery();
			while(rs.next()) {
				Task ts=new Task();
				int taskid=rs.getInt(1);
				int ownerid=rs.getInt(2);
				int creatorid=rs.getInt(3);
				String name=rs.getString(4);
				String description=rs.getString(5);
				String status=rs.getString(6);
				String priority=rs.getString(7);
				String notes=rs.getString(8);
				Boolean isbookmarked=rs.getBoolean(9);
				Timestamp createdon=rs.getTimestamp(10);
				Timestamp statuschangedon =rs.getTimestamp(11);
				ts.setTask_Id(taskid);
				ts.setOwner_Id(ownerid);
				ts.setCreator_Id(creatorid);
				ts.setName(name);
				ts.setDescription(description);
				ts.setStatus(status);
				ts.setPriority(priority);
				ts.setNotes(notes);
				ts.setIsBookmarked(isbookmarked);
				ts.setCreated_On(createdon);
				ts.setStatusChanged_On(statuschangedon);
			}
		}catch(SQLException e) {e.printStackTrace();}
		
		return taskList;
		}

}
