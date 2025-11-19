package com.nit.libraryManagement;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class AddBookServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		BookBean bb=new BookBean();
		bb.setId(req.getParameter("id"));
		bb.setName(req.getParameter("bookname"));
		bb.setAuthorName(req.getParameter("authorname"));
		bb.setPrice(Integer.parseInt(req.getParameter("price")));
		bb.setQuantity(Integer.parseInt(req.getParameter("qty")));
		int k=new AddBookDAO().addBook(bb);
		if(k>0)
		{
			req.setAttribute("msg", "Book Added Successfully");
			RequestDispatcher rd=req.getRequestDispatcher("addbook.jsp");
			rd.forward(req, resp);	
		}
		else
		{
			req.setAttribute("msg", "Book is not Added");
			RequestDispatcher rd=req.getRequestDispatcher("addbook.jsp");
			rd.forward(req, resp);
		}
		
		
	}

}
