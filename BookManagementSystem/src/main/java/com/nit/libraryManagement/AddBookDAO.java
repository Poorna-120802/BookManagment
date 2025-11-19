package com.nit.libraryManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddBookDAO 
{
	Connection con=DBConnection.getCon();
	public int addBook(BookBean bb)
	{
		int k=0;
		try
		{
			PreparedStatement ps=con.prepareStatement("insert into booksinfo values(?,?,?,?,?)");
			ps.setString(1, bb.getId());
			ps.setString(2, bb.getName());
			ps.setString(3, bb.getAuthorName());
			ps.setInt(4, bb.getPrice());
			ps.setInt(5, bb.getQuantity());
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
