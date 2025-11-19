package com.nit.libraryManagement;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/viewallbooks")
public class ViewAllBooksServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		ArrayList<BookBean> list=new ViewAllBooksDAO().viewAllBooks();
		
		req.setAttribute("list", list);
		RequestDispatcher rd=req.getRequestDispatcher("viewallbooks.jsp");
		rd.forward(req, resp);
		
	}

}
