package com.nit.libraryManagement;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/admlog")
public class AdminLoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session=req.getSession();
		String name=req.getParameter("admname");
		String password=req.getParameter("admpass");
		
		AdminRegBean ab= new AdminLoginDAO().login(name, password);
		if(ab!=null)
		{
			//login successfull
			session.setAttribute("bean", ab);
			req.setAttribute("bean", ab);
			RequestDispatcher rq=req.getRequestDispatcher("AdminLoginSuccess.jsp");
			rq.forward(req, resp);
			
		}
		else
		{
			//login failed
			//req.setAttribute("fmsg", "Login Failed! Please provide valid credentials");
			RequestDispatcher rq=req.getRequestDispatcher("AdminLoginFail.jsp");
			rq.forward(req, resp);
		}
	}

}
