package com.cdk.service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {

    Map<String, String> userList = new HashMap<>();

    public void init() {
        userList.put("Apurva", "password");
        userList.put("Prachi", "password");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        String username = request.getParameter("user");
        String password = request.getParameter("password");
        boolean flag = false;

        for (Map.Entry<String, String> entry : userList.entrySet()) {
            if(entry.getKey().equals(username) && entry.getValue().equals(password)){
                flag = true;
                HttpSession session = request.getSession();
                session.setAttribute("U_NAME",username);
                session.setAttribute("PASSWORD", password);
                session.setAttribute("LoggedInFlag", flag);
                response.getWriter().write("<h1>Logged In</h1>");
                break;
            }
        }

        if (flag == false){
            response.getWriter().write("<h1>Invalid!!!!!!</h1>");
            response.getWriter().write("<form method='GET' action='login.html'><input type='submit' value='LogIn' /></form>");

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
