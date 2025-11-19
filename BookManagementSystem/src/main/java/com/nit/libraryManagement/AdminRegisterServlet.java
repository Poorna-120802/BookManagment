package com.nit.libraryManagement;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class AdminRegisterServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		AdminRegBean ab=new AdminRegBean();
		ab.setName(req.getParameter("admname"));
		ab.setPassword(req.getParameter("admpass"));
		ab.setFname(req.getParameter("fname"));
		ab.setLname(req.getParameter("lname"));
		ab.setMailId(req.getParameter("mail"));
		ab.setPhno(req.getParameter("phno"));
		
		
			
			if(AdminRegDAO.insert(ab)>0)
			{
				req.setAttribute("msg", "Registration Done Successfully");
				RequestDispatcher rq=req.getRequestDispatcher("reg.jsp");
				rq.forward(req, resp);
			}
			else
			{
				req.setAttribute("msg", "Registration Failed");
				RequestDispatcher rq=req.getRequestDispatcher("reg.jsp");
				rq.forward(req, resp);
			 
			}
		
		
	}

}
