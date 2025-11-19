package com.nit.libraryManagement;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/del")
public class DeleteBookServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String id=req.getParameter("id");
		int k=new DeleteBookDAO().deleteBook(id);		
		if(k>0)
		{
			//deleted
			req.setAttribute("msg", "Book deleted Successfully!");
			RequestDispatcher rq=req.getRequestDispatcher("delbook.jsp");
			rq.forward(req, resp);
		}
		else
		{
			//not deleted
			req.setAttribute("msg", "Book is not deleted");
			RequestDispatcher rq=req.getRequestDispatcher("delbook.jsp");
			rq.forward(req, resp);
		}
	}

}
