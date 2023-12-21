package com.project.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RegistrationForm {
	
	public static void registration(){

		try {
			Connection c=DBUtil.getConnection();
			 Scanner sc= new Scanner(System.in);
			 
			 System.out.println("Enter the First Name=");
			 String fname=sc.next();
			 
			 System.out.println("Enter the Last Name=");
			 String lname=sc.next();
			 
			 System.out.println("Enter the Username=");
			 String Username=sc.next();
			 
			 System.out.println("Enter the password=");
			 String password=sc.next();
			 
			 System.out.println("Enter the city= ");
			 String city=sc.next();
			 
			 System.out.println("Enter the Email=");
			 String email=sc.next();
			 
			 System.out.println("Enter the Mobile number=");
			 String Mobile_No=sc.next();
			 
			 String q="insert into registration values(?,?,?,?,?,?,?)";
			 PreparedStatement p=c.prepareStatement(q);
			p.setString(1, fname);
			p.setString(2, lname);
			p.setString(3, Username);
			p.setString(4, password);
			p.setString(5, city);
			p.setString(6, email);
			p.setString(7, Mobile_No);
			p.execute();
			System.out.println("Registration successfully...");
			c.close();
			p.close();
			 
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			
		}
	}

}
