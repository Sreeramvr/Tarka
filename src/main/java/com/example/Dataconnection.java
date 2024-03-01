package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dataconnection {
    public static void main(String[] args) {
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Set the connection URL, username, and password
            String url = "jdbc:mysql://13.232.155.0/vyapak";
            String username = "tarka";
            String password = "tarka*62M!C8}V]T7U_tRtitpl";

            // Connect to the database
            Connection conn = DriverManager.getConnection(url, username, password);

            // Create a statement object
            Statement stmt = conn.createStatement();

            // Execute a SELECT query
            ResultSet rs = stmt.executeQuery("SELECT sl_no,employee_name FROM tarka");

            // Process the result set
            while (rs.next()) {
                int sl_no = rs.getInt("sl_no");
                String employee_name = rs.getString("employee_name");
                // int age = rs.getInt("age");

                // Print the retrieved data
                System.out.println("sl_no: " + sl_no + ", employee_name: " + employee_name );
            }

            // Close the resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}