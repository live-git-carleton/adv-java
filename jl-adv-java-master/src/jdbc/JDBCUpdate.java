package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdate {
	public static void main(String[] args) {
		System.out.println("Driver Loaded!");
// load the driver	
//		try {
//			// Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println(e);
//		}

// create the connection
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "mysql");
			System.out.println("Connection Established!");

// create the statement
			Statement statement = connection.createStatement();
			System.out.println("Statement created!");
			// Fetch the results by executing the query
			// ResultSet resultSet = statement.execute("select * from actor");
			int noOfRowsINstered = statement
					.executeUpdate("INSERT INTO user values (105, 'm@m.com','rainy','mountain')");
			System.out.println("No Of Rows Insert : " + noOfRowsINstered);

//			resultSet.close();
//			statement.close();
//			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
