package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class DataServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String slno = request.getParameter("sl_no");
        String employeename = request.getParameter("employee_name");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://13.232.155.0/vyapak", "tarka", "tarka*62M!C8}V]T7U_tRtitpl");

            PreparedStatement ps = con
                    .prepareStatement("insert into tarka (sl_no,employee_name) values(?,?)");

            ps.setString(1, slno);
            ps.setString(2, employeename);

            int i = ps.executeUpdate();
            if (i > 0)
                out.print("You are successfully registered...");

        } catch (Exception e2) {
            System.out.println(e2);
        }

        out.close();
    }
}
