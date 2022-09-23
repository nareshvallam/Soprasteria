package com.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Details.Employee;
import com.connection.MyConnection;

public class EmployeeDao {
	public boolean insertEmp(Employee e) {
		String sql="insert into emp(email,empName,empPass,regDate) values(?,?,?,now())";
		try {
			PreparedStatement p=MyConnection.getConnect().prepareStatement(sql);
			p.setString(1, e.getEmail());
			p.setString(2,e.getEmpName());
			p.setString(3,e.getPass());
			//p.setDate(4,   e.getRegDate());
			return p.executeUpdate()>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
		
		
	}
	public boolean inser2(String user) {
		String sql="insert into empdet (empName,logDate) values(?,now())";
		try {
			PreparedStatement p=MyConnection.getConnect().prepareStatement(sql);
			p.setString(1,user);
			return p.executeUpdate()>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return false;
		
	}
	public boolean updatel(String dl) {
		String sql="update empdet set logoDate=now() where logDate=?";
		try {
			PreparedStatement p=MyConnection.getConnect().prepareStatement(sql);
			p.setString(1,dl);
			return p.executeUpdate()>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return false;
		
	}
	
	public String checkUser(String user) {
		String sql="select empPass from emp where empName=?";
		try {
			PreparedStatement p=MyConnection.getConnect().prepareStatement(sql);
			p.setString(1,user);
			ResultSet rd= p.executeQuery();
			String pass = null;
			while(rd.next()) {
			  pass=rd.getString("empPass");
			}
		return pass;
		}
		catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
		
	}
	public boolean updateEmpIn(String user) {
		String sql="update emp set logdate=now() where empName=?"; 
		try {
			PreparedStatement p=MyConnection.getConnect().prepareStatement(sql);
			p.setString(1,user);
			return p.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return false;
		
	}
	public boolean updateEmpOut(String user) {
		String sql="update emp set logodate=now() where logDate=?"; 
		try {
			PreparedStatement p=MyConnection.getConnect().prepareStatement(sql);
			p.setString(1,user);
			return p.executeUpdate()>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	public List<Employee> getUsers(String user){
		List<Employee> l= new ArrayList<>();
		String sql="select * from empdet where empName=?";
		
		try {
			PreparedStatement p= MyConnection.getConnect().prepareStatement(sql);
			p.setString(1, user);
			Employee em= null;
			ResultSet res=p.executeQuery();
			while(res.next()) {
				String user2=res.getString("empName");
				String in=res.getString("logDate");
				String out=res.getString("logoDate");
//				String reg=res.getString("regDate");
//				Stri	ng log=res.getString("logDate");
//				String logo=res.getString("logoDate");
				em= new Employee(null,user2,null,in,out);
			l.add(em);
				
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
		
	}
	public String getI(String user) {
		String sql="select logDate from empdet where empName=?  order by logdate desc limit 1";
		try {
			PreparedStatement p= MyConnection.getConnect().prepareStatement(sql);
			p.setString(1, user);
			ResultSet r=p.executeQuery();
			String d=null;
			while(r.next()) {
				d=r.getString("logDate");
						
			}
			return d;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	public String getO(String user) {
		String sql="select logoDate from empdet where empName=? order by logdate desc limit 1";
		try {
			PreparedStatement p= MyConnection.getConnect().prepareStatement(sql);
			p.setString(1, user);
			ResultSet r=p.executeQuery();
			String d=null;
			while(r.next()) {
				d=r.getString("logoDate");
						
			}
			return d;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
