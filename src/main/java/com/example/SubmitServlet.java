package com.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class SubmitServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Handle GET requests here
        // You can redirect the user to a form to collect data and submit it via a POST request
        response.sendRedirect("input.jsp");

        String slno = request.getParameter("sl_no");
        String employeeName = request.getParameter("employee_name");

        if (slno == null || slno.isEmpty() || employeeName == null || employeeName.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "slno and Name are required.");
            return;
        }

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://13.232.155.0/vyapak", "tarka", "tarka*62M!C8}V]T7U_tRtitpl")) {
            String sql = "INSERT INTO tarka (sl_no, employee_name) VALUES (?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, slno);
            stmt.setString(2, employeeName);
            stmt.executeUpdate();
        } catch (SQLException e) {
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e.getMessage());
            return;
        }

        response.sendRedirect("success.jsp");
    }
}