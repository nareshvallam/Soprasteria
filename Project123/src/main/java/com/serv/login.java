package com.serv;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Details.Employee;
import com.dao.EmployeeDao;


/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p=resp.getWriter();
		resp.setContentType("text/html");
		HttpSession se= req.getSession();
		String user=req.getParameter("user");
		String pass=req.getParameter("pass");
		se.setAttribute("user", user);
		se.setAttribute("pass", pass);
	
//		rd.forward(req, resp);
//		p.println(user+pass);
		EmployeeDao ed=new EmployeeDao ();
		String pass2= ed.checkUser(user);
		if (pass.equals(pass2)){
			RequestDispatcher rd= req.getRequestDispatcher("p1success.jsp");
			rd.include(req, resp);
			ed.updateEmpIn(user);
			ed.inser2(user);
			p.println("<h1>Your login time is <h1>"+ed.getI(user));
		}
		else {
			RequestDispatcher rd= req.getRequestDispatcher("p1login.jsp");
			rd.include(req, resp);
			p.println("<p>Invalid user name or password<p>");
			p.print("<p>Not an existing User? <p>");
			p.print("<a href='http://localhost:8081/Project1/p1login.jsp' >Sign up</a>");
			
		}
	
			
		}
	

}