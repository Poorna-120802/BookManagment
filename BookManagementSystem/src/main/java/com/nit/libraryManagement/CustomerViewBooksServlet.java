package com.nit.libraryManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/CustViewBooks")
public class CustomerViewBooksServlet extends HttpServlet
{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session=req.getSession(false);
		if(session==null)
		{
			req.setAttribute("msg", "Session Expired!");
			RequestDispatcher r=req.getRequestDispatcher("entry.jsp");
			r.forward(req, resp);
		}
		else
		{
			List<BookBean> booklist = new CustomerViewBookDAO().viewBooks();
			session.setAttribute("list", booklist);
			RequestDispatcher r=req.getRequestDispatcher("CustViewBooks.jsp");
			r.forward(req, resp);
		}
		
		
		
		
	}

}
