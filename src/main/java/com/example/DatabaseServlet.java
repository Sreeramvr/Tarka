package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class DatabaseServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://13.232.155.0/vyapak", "tarka", "tarka*62M!C8}V]T7U_tRtitpl");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select sl_no,employee_name from tarka");

            out.println("<table border=1 width=50% height=50%>");
            out.println("<tr><th>SLNO</th><th>EMPLOYEENAME</th><tr>");

            while (rs.next()) {
                String n = rs.getString("sl_no");
                String nm = rs.getString("employee_name");

                out.println("<tr><td>" + n + "</td><td>" + nm + "</td></tr>");
            }

            out.println("</table>");
            out.close();
        } catch (Exception e) {
            out.println("error");
        }
    }
}

