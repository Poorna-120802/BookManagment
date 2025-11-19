package com.nit.libraryManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerPaymentDAO 
{
	Connection con=DBConnection.getCon();
	public int qtyUpdate(String id,int qty)
	{
		int k=0;
		try
		{
			PreparedStatement ps=con.prepareStatement("update booksinfo set quantity=? where id=?");
			ps.setInt(1, qty);
			ps.setString(2, id);
			k=ps.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			return k;
		}
		
	}

}
