package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelectDemo {
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
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "mysql");
			System.out.println("Connection Established!");

// create the statement
			Statement statement = connection.createStatement();
			System.out.println("Statement created!");
			// Fetch the results by executing the query
			ResultSet resultSet = statement.executeQuery("select * from actor");
			// Iterate the resultSet
			while (resultSet.next()) {
				String firstNameString = resultSet.getString("first_name");
				System.out.println(firstNameString);
			}

//			resultSet.close();
//			statement.close();
//			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
