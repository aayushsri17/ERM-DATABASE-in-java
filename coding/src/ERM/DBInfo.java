package ERM;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBInfo
{
    static
    {
      try 
      {
		Class.forName("com.mysql.jdbc.Driver");
	  }
      catch (ClassNotFoundException e) 
      {
	
		e.printStackTrace();
	  }
    }
    public static Connection getConnection()
    {
    	Connection con=null;
    	try 
    	{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
		}
    	catch (SQLException e) 
    	{
			e.printStackTrace();
		}
    	return con;
    }
    
    
    
}
