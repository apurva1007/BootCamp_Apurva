package com.example;

import java.io.*;
import javax.servlet.*;

public class PersonalInfo extends GenericServlet {
		
	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
		PrintWriter pw = response.getWriter();
		pw.write("Name: Apurva<br>");
		pw.write("Employee Id: 502838<br>");
		pw.write("Email Id: apurva.ruplag@gmail.com<br>");
	}	

}