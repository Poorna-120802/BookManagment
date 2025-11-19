package com.nit.libraryManagement;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
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
			session.invalidate();
			req.setAttribute("msg", "Logout Successfully!");
		}
		RequestDispatcher r=req.getRequestDispatcher("entry.jsp");
		r.forward(req, resp);
	}

}
