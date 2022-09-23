package com.serv;

import java.io.IOException;
import java.io.PrintWriter;
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


@WebServlet("/view")
public class view extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p=resp.getWriter();
		resp.setContentType("text/html");
		HttpSession hs= req.getSession();
		String user=(String) hs.getAttribute("user");
		EmployeeDao ed=new EmployeeDao ();
		RequestDispatcher rd= req.getRequestDispatcher("p1success.jsp");
		rd.include(req, resp);
		List<Employee> e=new ArrayList<>();
		e.addAll(ed.getUsers(user));
		p.println("<table border=4px>");
		p.println("<tr>");
		p.println("<th>UserName<th>");
		p.println("<th>LogInDate<th>");
		p.println("<th>LogoutDate<th>");
		p.println("</tr>");
		for (Employee s:e) {
			p.println("<tr>");
			p.println("<td>"+s.getEmpName()+"<td>");
			p.println("<td>"+s.getIn()+"<td>");
			p.println("<td>"+s.getOut()+"<td>");
			p.println("</tr>");
			
		}
		p.println("</table>");
	}

}