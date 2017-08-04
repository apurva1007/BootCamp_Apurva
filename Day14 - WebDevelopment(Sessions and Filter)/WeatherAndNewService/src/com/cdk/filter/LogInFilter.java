package com.cdk.filter;

import com.sun.deploy.net.HttpRequest;
import com.sun.org.apache.xpath.internal.operations.Bool;

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
        HttpServletResponse response = (HttpServletResponse) resp;

        HttpSession session = request.getSession();

        if((Boolean) session.getAttribute("LoggedInFlag") == null){
            System.out.println("redirect");
            response.sendRedirect("/login.html");
        }else{
            if((Boolean) session.getAttribute("LoggedInFlag")== true) {
                System.out.println("logggeeeddddiiiiinnn");
                chain.doFilter(req, resp);
            }
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
