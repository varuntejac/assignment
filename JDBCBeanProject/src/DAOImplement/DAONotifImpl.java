package DAOImplement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.sonata.Dao.DaoNotificationInter;
import com.sonata.Model.Notification;

public class DAONotifImpl implements DaoNotificationInter {
	int row6=0;
	int row7;
	int row8;
	DbConnection db=new DbConnection();
	Notification notif=null;
	@Override
	public int Save(Object object)
	{
		try {
			notif=(Notification)object;
			PreparedStatement cs=db.getConnection().prepareStatement("insert into notification values (?,?,?,?,?,?)");
			cs.setInt(1, notif.getNotification_Id());
			cs.setInt(2,notif.getTask_Id());
			cs.setInt(3, notif.getTask_Owner_Id());
			cs.setString(4, notif.getStatus());
			cs.setTimestamp(5, notif.getCreated_On());
			cs.setTimestamp(6, notif.getStatus_Changed_On());
			row6=cs.executeUpdate();
			db.closeConnection();
			}catch(SQLException e) {System.out.println(e);}
		return row6;
	}
	
	public int delete(Object object)
	{
		try {
			notif =(Notification)object;
			PreparedStatement cs1=db.getConnection().prepareStatement("delete from notification where Notification_Id=?");
			cs1.setInt(1,2);
			row7=cs1.executeUpdate();
			System.out.println("number of records are deleted:" +row7);
			db.closeConnection();
		}catch(SQLException e) {System.out.println(e);}
		return row7;
	}
	public int update(Object object)
	{
		try {
			notif=(Notification)object;
			PreparedStatement cs2=db.getConnection().prepareStatement("update Task set Name=?  where Task_Id=?");
			cs2.setString(1,"Bhavya");
			cs2.setInt(2,1);
			row8=cs2.executeUpdate();
			System.out.println("this number of updated records  are "+row8);
			db.closeConnection();
		}catch(SQLException e) {System.out.println(e);}
		return row8;
	}
	public List<Notification> getData()
	{
	List<Notification> notifList=new ArrayList<>();
		try {
			PreparedStatement cs2=db.getConnection().prepareStatement("select * from notification");
			ResultSet rs=cs2.executeQuery();
			while(rs.next())
			{
				Notification ns=new Notification();
				int notificationid=rs.getInt(1);
				int taskid=rs.getInt(2);
				int taskownerid=rs.getInt(3);
				String status=rs.getString(4);
				Timestamp createdon=rs.getTimestamp(5);
				Timestamp statuschangedon=rs.getTimestamp(6);
				ns.setNotification_Id(notificationid);
				ns.setTask_Id(taskid);
				ns.setTask_Owner_Id(taskownerid);
				ns.setStatus(status);
				ns.setCreated_On(createdon);
				ns.setStatus_Changed_On(statuschangedon);
			}
		}catch(SQLException e) {e.printStackTrace();}
		return notifList;
	}
}