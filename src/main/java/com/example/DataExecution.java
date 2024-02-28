package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class DataExecution {

    public static void executeData() {
        try (Connection connection = DatabaseConnection.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(" SELECT sl_no,employee_name FROM tarka; ");

            while (resultSet.next()) {
                System.out.println("sl_no: " + resultSet.getInt("sl_no") + ", employee_name: " + resultSet.getString("employee_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
