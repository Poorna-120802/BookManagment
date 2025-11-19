package com.nit.libraryManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateBookDAO 
{
	Connection con=DBConnection.getCon();
	public int updateBook(BookBean bb)
	{
		int k=0;
		try
		{
		PreparedStatement ps=con.prepareStatement("update booksinfo set name=?,author_name=?,price=?,quantity=? where id=?");
		ps.setString(1, bb.getName());
		ps.setString(2, bb.getAuthorName());
		ps.setInt(3, bb.getPrice());
		ps.setInt(4, bb.getQuantity());
		ps.setString(5, bb.getId());
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
