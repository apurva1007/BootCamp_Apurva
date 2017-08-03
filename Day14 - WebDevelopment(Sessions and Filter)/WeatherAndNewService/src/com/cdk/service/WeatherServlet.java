package com.cdk.service;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(name = "com.cdk.service.WeatherServlet")
public class WeatherServlet extends HttpServlet {

	Map<String,String> data = new HashMap<>();			

	public void init()  throws ServletException {
	
		data.put("Pune","22"); 
		data.put("Mumbai","28"); 
		data.put("Delhi","42"); 
		data.put("GOA","23"); 
	}

	public void destroy() {
		data.clear();
		data = null;	
	}	

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{

        response.setContentType("text/html");

        HttpSession session = request.getSession();

		String cityName = "Pune";//request.getParameter("city");
		String dayName = "12";//request.getParameter("day");
		
		PrintWriter pw = response.getWriter();
		pw.write("<h2>");
		pw.write("Weather of the "+cityName+" on "+dayName+" day is : "+data.get(cityName)+" degree.");
		pw.write("</h2>");

        response.getWriter().write("<form method='GET' action='logout'><input type='submit' value='LOGOUT' /></form>");
	}
}