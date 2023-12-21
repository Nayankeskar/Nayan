package com.project.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3307/quiz_project?characterEncoding=latin1";
		Connection c=DriverManager.getConnection(url,"root", "root123");
		return c;
	}
}
