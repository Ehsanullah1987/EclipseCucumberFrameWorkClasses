package com.hrmsJDBC.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.Test;

public class JdbcTask {
//String dbUsername="syntax_hrm";
//String dbPassword="syntaxhrm123";
//String dbUrl="jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
@Test
//Create connection to db and retrieve all job titles and store them inside arraylist
public void TaskSQLDB() throws SQLException {
	//jdbc:which database driver://host:port/name of database
	Connection conn = DriverManager.getConnection("jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql", "syntax_hrm", "syntaxhrm123");
	Statement stat = conn.createStatement();
	ResultSet result = stat.executeQuery("select * from ohrm_job_title");
	ArrayList <String>arrData = new ArrayList<>();
	while(result.next()) {
		arrData.add(result.getString("job_title"));
	}
	//System.out.println(arrData.toString());
	for(String data:arrData) {
		System.out.println(data);
	}
}
}