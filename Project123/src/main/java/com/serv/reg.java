package com.serv;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Details.Employee;
import com.dao.EmployeeDao;

/**
 * Servlet implementation class reg
 */
@WebServlet("/reg")
public class reg extends HttpServlet {
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String user=req.getParameter("user");
			String pass=req.getParameter("pass");
			String email=req.getParameter("email");
			//LocalDateTime d=  LocalDateTime.now();
			Employee e=new Employee(email,user,pass,null,null);
			EmployeeDao rd=new EmployeeDao();
			rd.insertEmp(e);
			RequestDispatcher d= req.getRequestDispatcher("p1login.jsp");
			d.forward(req, resp);
			
	}

}
