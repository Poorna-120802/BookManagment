package com.nit.libraryManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerLoginDAO 
{
	Connection con=DBConnection.getCon();
	@SuppressWarnings("finally")
	public CustomerBean select(String mailid,String password)
	{
		CustomerBean cb=null;
		try
		{
			
			PreparedStatement ps=con.prepareStatement("select * from customerreg where mailid=? and password=?");
			ps.setString(1, mailid);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{   cb=new CustomerBean();
				cb.setcName(rs.getString(1));
				cb.setPassword(rs.getString(2));
				cb.setfName(rs.getString(3));
				cb.setlName(rs.getString(4));
				cb.setMailId(rs.getString(5));
				cb.setPhno(rs.getLong(6));
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
//			try 
//			{
//				con.close();
//			}
//			catch (SQLException e)
//			{
//				e.printStackTrace();
//			}
			
			return cb;	
		}
	
	}
}
