package com.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/showData")
public class Dataconnection extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Set the connection URL, username, and password
            String url = "jdbc:mysql://13.232.155.0/vyapak";
            String username = "tarka";
            String password = "tarka*62M!C8}V]T7U_tRtitpl";

            // Connect to the database
            conn = DriverManager.getConnection(url, username, password);

            // Create a statement object
            stmt = conn.createStatement();

            // Execute a SELECT query
            rs = stmt.executeQuery("SELECT sl_no,employee_name FROM tarka");

            // Store the results in the request object
            request.setAttribute("results", rs);

            // Forward the request to a JSP page
            RequestDispatcher rd = request.getRequestDispatcher("/showData.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try { rs.close(); } catch (Exception e) {}
            try { stmt.close(); } catch (Exception e) {}
            try { conn.close(); } catch (Exception e) {}
        }
    }
}