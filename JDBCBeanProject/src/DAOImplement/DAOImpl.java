package DAOImplement;

import java.sql.Timestamp;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sonata.Dao.DaoInter;
import com.sonata.Model.User;

public class DAOImpl implements DaoInter {
	
	int row=0;
	int row1;
	int row2;
	DbConnection db=new DbConnection();
	User user=null;
	
	public int save(Object object)
	{
		try {
			user=(User)object;
			PreparedStatement cs= db.getConnection().prepareStatement
					("insert into User values(?,?,?,?,?,?,?,?,?,?,?)");
			cs.setInt(1,user.getUser_Id());
			cs.setString(2, user.getUsername());
			cs.setString(3, user.getEmail());
			cs.setString(4, user.getFirst_Name());
			cs.setString(5, user.getLast_Name());
			cs.setLong(6, user.getContact_Number());
			cs.setString(7, user.getROLE());
			cs.setBoolean(8, user.getIsActive());
			cs.setDate(9, user.getDOB());
			cs.setTimestamp(10, user.getCreated_On());
			cs.setString(11,user.getPassword());
			row=cs.executeUpdate();
			db.closeConnection();
		}catch(SQLException e) {System.out.println(e);}
		return row;
	}
	@Override
	public int update(Object object)
	{
		try {
			user=(User)object;
			PreparedStatement cs2=db.getConnection().prepareStatement("update user set Username=?  where User_Id=?");
			cs2.setString(1,"Sravani");
			cs2.setInt(2,5);
			row1=cs2.executeUpdate();
			System.out.println("this number of updated records  are "+row1);
			db.closeConnection();
		}catch(SQLException e) {System.out.println(e);}
		return row1;
		
	}
	@Override
	public int delete(Object object)
	{
		try {
			user=(User)object;
			PreparedStatement cs2=db.getConnection().prepareStatement("delete from user where User_Id=?");
			cs2.setInt(1,4);
			row2=cs2.executeUpdate();
			System.out.println("this number of records deleted are "+row2);
			db.closeConnection();
		}catch(SQLException e) {System.out.println(e);}
		return row2;
	}
		@Override 
		public List<User> getData(){
		List<User> userList=new ArrayList<>();
		try {
			PreparedStatement cs1=db.getConnection().prepareStatement("select * from user");
			ResultSet rs=cs1.executeQuery();
			while(rs.next()) {
				User us=new User();
				int userid=rs.getInt(1);
				String username=rs.getString(2);
				String email=rs.getString(3);
				String fname=rs.getString(4);
				String lname =rs.getString(5);
				Long cnum=rs.getLong(6);
				String role=rs.getString(7);
				Boolean isactive=rs.getBoolean(8);
				Date dob=rs.getDate(9);
				Timestamp createdon=rs.getTimestamp(10);
				String pass=rs.getString(11);
				us.setUser_Id(userid);
				us.setUsername(username);
				us.setEmail(email);
				us.setFirst_Name(fname);
				us.setLast_Name(lname);
				us.setContact_Number(cnum);
				us.setROLE(role);
				us.setIsActive(isactive);
				us.setDOB(dob);
				us.setCreated_On(createdon);
				us.setPassword(pass);
			}
		}catch(SQLException e) {e.printStackTrace();}
		
		return userList;
		}

}
