import java.io.IOException;
import java.io.PrintWriter;

public class NumberAndTime extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        pw.write("<h2>Time: </h2>" + java.util.Calendar.getInstance().getTime() + "<br/>");
        pw.write("<h2>Random Number: </h2>" + Math.random()*1000 + "<br/>");
    }
}
