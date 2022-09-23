package com.Details;

import java.time.LocalDateTime;
import java.util.Date;

public class Employee {
	private String email;
	private String empName;
	private String pass;
	private String in;
	private String out;
	public String getIn() {
		return in;
	}
	public void setIn(String in) {
		this.in = in;
	}
	public String getOut() {
		return out;
	}
	public void setOut(String out) {
		this.out = out;
	}
	//LocalDateTime regDate;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
//	public LocalDateTime getRegDate() {
//		return regDate;
//	}
//	public void setRegDate(LocalDateTime regDate) {
//		this.regDate = regDate;
//	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [email=" + email + ", empName=" + empName + ", pass=" + pass + ", in=" + in + ", out=" + out
				+ "]";
	}
	public Employee( String email,String empName, String pass, String in, String out) {
		super();
		this.empName = empName;
		this.email = email;
		
		this.pass = pass;
		this.in = in;
		this.out = out;
	}
}
