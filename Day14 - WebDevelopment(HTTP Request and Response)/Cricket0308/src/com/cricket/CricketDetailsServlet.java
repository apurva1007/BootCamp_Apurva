package com.cricket;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

class Cricket {
    String country1;
    String country2;
    String typeMatch;
    double score;
    String city;
    double overs;

    public Cricket(String country1, String country2, String typeMatch, double score, String city, double overs) {
        this.country1 = country1;
        this.country2 = country2;
        this.typeMatch = typeMatch;
        this.score = score;
        this.city = city;
        this.overs = overs;
    }
}

public class CricketDetailsServlet extends javax.servlet.http.HttpServlet {

    List<Cricket> data = new ArrayList<>();
    public void init() {
        Cricket match1 = new Cricket("India", "England", "T-20", 657.96,"Pune", 1.9);
        Cricket match2 = new Cricket("India", "Pakistan", "OneDay", 200.96,"Pune", 20);
        Cricket match3 = new Cricket("Australia", "England", "T-20", 879.96,"Pune", 7);
        Cricket match4 = new Cricket("Pakistan", "England", "OneDay", 97.96,"Pune", 8);


        data.add(match1);
        data.add(match2);
        data.add(match3);
        data.add(match4);
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.setContentType("text/html");
        String country1 = request.getParameter("c1");
        String country2 = request.getParameter("c2");
        String matchType = request.getParameter("matchType");

        PrintWriter pw = response.getWriter();

        Iterator<Cricket> itr = data.iterator();

        double score = 0.0, overs = 0.0;
        String city = null;

        while(itr.hasNext()) {
            Cricket obj = itr.next();
            if(obj.country1.equals(country1) && obj.country2.equals(country2) && obj.typeMatch.equals(matchType)){
                score = obj.score;
                overs = obj.overs;
                city = obj.city;
                break;
            }
        }

        pw.write("<h2>Details of " + matchType + " between " + country1 + " and " + country2 + ": </h2><br />");
        pw.write("<h3>Score: </h3>" + score + "<br />");
        pw.write("<h3>Overs: </h3>" + overs + "<br />");
        pw.write("<h3>City: </h3>" + city + "<br />");
    }

   /* protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.setContentType("text/html");
        String country1 = request.getParameter("country1");
        String country2 = request.getParameter("country2");
        String matchType = request.getParameter("matchType");

        PrintWriter pw = response.getWriter();

        Iterator<Cricket> itr = data.iterator();

        double score = 0.0, overs = 0.0;
        String city = null;

        while(itr.hasNext()) {
            Cricket obj = itr.next();
            if(obj.country1.equals(country1) && obj.country2.equals(country2) && obj.typeMatch.equals(matchType)){
                score = obj.score;
                overs = obj.overs;
                city = obj.city;
                break;
            }
        }

        pw.write("Details of " + matchType + " between " + country1 + " and " + country2 + ": ");
        pw.write("Score: " + score);
        pw.write("Overs: " + overs);
        pw.write("City: " + city);

    }*/


}

