package com.project.quiz;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.Scanner;

	public class LoginForm {

	    public static void studlogin() {
	        try {
	        	Connection c=DBUtil.getConnection();

	            // Create a PreparedStatement to execute SQL queries
	            PreparedStatement pre = c.prepareStatement("SELECT * FROM registration WHERE username=? AND spassword=?");

	            // Get user input for username and password
	            Scanner scanner = new Scanner(System.in);
	            System.out.print("Enter your username: ");
	            String username = scanner.nextLine();
	            System.out.print("Enter your password: ");
	            String password = scanner.nextLine();

	            // Set parameters in the PreparedStatement
	            pre.setString(1, username);
	            pre.setString(2, password);

	            // Execute the query
	            ResultSet resultSet= pre.executeQuery();

	            // Check if a matching user is found
	            if (resultSet.next()) {
	                System.out.println("Login successful!");
	            } else {
	                System.out.println("Incorrect username or password. Please try again.");
	            }

	            // Close resources
	            resultSet.close();
	            pre.close();
	            c.close();
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
	


