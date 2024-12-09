package DDT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql 
{
	public static void main(String[] args) throws SQLException 
	{
		String url="jdbc:MySql://localhost:3306/Newsfile";
		String usn="root";
		String psw="root";
		Connection connection = DriverManager.getConnection(url,usn,psw);
		Statement statement = connection.createStatement();
		ResultSet query = statement.executeQuery("select * from Testdata");
		query.next();
		String usn1 = query.getString("usn");
		String psw1 = query.getString("psw");
		System.out.println(usn1+" "+psw1);
		query.next();
		String usn2 = query.getString("usn");
		String psw2 = query.getString("psw");
        
		
	}

}
