package com.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.EmployeeDao;


@WebServlet("/logout")
public class logout extends HttpServlet {

		@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter p=resp.getWriter();
		resp.setContentType("text/html");
		HttpSession hs=req.getSession();
		String user=(String) hs.getAttribute("user");
		RequestDispatcher rd= req.getRequestDispatcher("p1logout.jsp");
		rd.include(req, resp);
		EmployeeDao ed=new EmployeeDao();
		String d=ed.getI(user);
		ed.updateEmpOut(d);
		ed.updatel(d);
		p.println("<h1> your logged out at <h1>"+ed.getO(user));
	}

}

