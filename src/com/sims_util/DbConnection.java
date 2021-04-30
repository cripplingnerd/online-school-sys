package com.sims_util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	private static Connection connection = null;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException, IOException {
		if (connection != null) {
			return connection;
		}else {
			// create db connection
			String url = "jdbc:mysql://loaclhost:3306/online_school_ims";
			String uname = "root";
			String pwd = "root";
			String driver = "com.mysql.jdbc.Driver";
			
			Class.forName(driver);
			connection = DriverManager.getConnection(url, uname, pwd);
			
			return connection;
		}
		
	}
}
