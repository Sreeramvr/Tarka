package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String DATABASE_URL = "jdbc:mysql://13.232.155.0/vyapak";
    private static final String DATABASE_USERNAME = "tarka";
    private static final String DATABASE_PASSWORD = "tarka*62M!C8}V]T7U_tRtitpl";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
    }
}