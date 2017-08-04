package com.cdk.service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "com.cdk.service.NewsServlet")
public class NewsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        System.out.println("News");
        response.getWriter().write("<h2>Today News : Laden is alive</h2>");

        response.getWriter().write("<form method='GET' action='logout'><input type='submit' value='LOGOUT' /></form>");
    }
}
