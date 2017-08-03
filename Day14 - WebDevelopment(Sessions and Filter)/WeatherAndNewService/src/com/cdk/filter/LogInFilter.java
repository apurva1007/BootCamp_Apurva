package com.cdk.filter;

import com.sun.deploy.net.HttpRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LogInFilter")
public class LogInFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = request.getSession(false);
        System.out.println(session);

        HttpServletResponse response = (HttpServletResponse) resp;

        if (!(session == null)) {
            boolean flag = (boolean) session.getAttribute("LoggedInFlag");
            System.out.println(flag);

            if(flag == true) {
                System.out.println("logggeeeddddiiiiinnn");
                chain.doFilter(req, resp);
            } else {
                resp.getWriter().write("Byeeeeee");
            }
        }else{
            response.sendRedirect("http://localhost:5000/WeatherAndNewService/login.html");
        }


    }

    public void init(FilterConfig config) throws ServletException {

    }

}
