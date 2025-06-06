package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String USER = "root"; 
    private static final String PASSWORD = "Medhavi4002";

    public static Connection connect() throws SQLException {
        // No need for Class.forName explicitly if using modern JDBC driver
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
