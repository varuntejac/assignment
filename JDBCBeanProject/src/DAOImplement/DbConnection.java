package DAOImplement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbConnection {
	Connection connection;
	public Connection getConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection =DriverManager.getConnection
					("jdbc:mysql://localhost:3306/CaseStudyDB","root","admin@123");
		}catch(ClassNotFoundException e) {e.printStackTrace();}
		catch(SQLException e) {e.printStackTrace();}
		return connection;	
	}
	public void closeConnection()
	{
		try {
			if(connection !=null)
			{
				connection.close();
			}
		}catch(SQLException s) {s.printStackTrace();}
	}
	

}
