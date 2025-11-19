package com.nit.libraryManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements DBInfo
{
	private DBConnection(){}
	private static Connection con=null;
	static
	{
		try 
		{
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,password);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static Connection getCon()
	{
		return con;
	}

}
