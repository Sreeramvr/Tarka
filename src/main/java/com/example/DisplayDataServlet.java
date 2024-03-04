package com.example;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/data")
public class DisplayDataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set the response MIME type to HTML
        response.setContentType("text/html;charset=UTF-8");

        // Get a PrintWriter for writing the response
        PrintWriter out = response.getWriter();

        // Write the response message, in an HTML page
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html><head>");
            out.println("<title>Display Data</title></head>");
            out.println("<body>");

            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://13.232.155.0/vyapak", "tarka", "tarka*62M!C8}V]T7U_tRtitpl");

            // Create a Statement object
            Statement stmt = conn.createStatement();

            // Execute a SQL query to retrieve data from the "employees" table
            ResultSet rs = stmt.executeQuery("SELECT sl_no,employee_name,adress,phone_no,created_by FROM tarka");

            // Display the data in an HTML table
            out.println("<table border='1', border-radius='5px'>");
            out.println("<tr><th>SLNO</th><th>EMPLOYEENAME</th> <th> ADRESS</th> <th> PHONENO</th> <th> CREATEDBY</th></tr>");
            while (rs.next()) {
                int id = rs.getInt("sl_no");
                String name = rs.getString("employee_name");
                String adress = rs.getString("adress");
              String phoneno = rs.getString("phone_no");
                String   createdby = rs.getString("created_by");
                out.println("<tr><td>" + id + "</td><td>" + name + "</td><td>"+ adress + "</td><td>" + phoneno + "</td><td>" + createdby + "</td></tr>");
            }
            out.println("</table>");

            // Close the ResultSet, Statement, and Connection objects
            rs.close();
            stmt.close();
            conn.close();

            out.println("</body></html>");

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }

    }

}
