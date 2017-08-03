package com.cdk.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Locale;

@WebFilter(filterName = "IPBlockFilter")
public class IPBlockFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {


        Locale localeCN = new Locale("zh", "CN");
        Locale locale = req.getLocale();
        if(locale.equals(localeCN)) {
            resp.getWriter().write("<h1 style='color:red'>Hello ji, Bye Bye</h1>");
        }
        else{
            System.out.println("IPFilter");
            chain.doFilter(req, resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
