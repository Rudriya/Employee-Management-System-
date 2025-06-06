package dao;

import model.Employee;
import java.sql.*;
import java.util.*;

public class EmployeeDAO {
    private final String jdbcURL = "jdbc:mysql://localhost:3306/employee_db?useSSL=false";
    private final String jdbcUsername = "root";
    private final String jdbcPassword = "Medhavi4002";

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");  // Updated driver class for newer MySQL versions
        return DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
    }

    // Fetch all employees
    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employee";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Employee emp = new Employee(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("department"),
                    rs.getDouble("salary")
                );
                list.add(emp);
            }
        } catch (Exception e) {
            printSQLException(e);
        }
        return list;
    }

    // Get employee by ID
    public Employee getEmployeeById(int id) {
        String sql = "SELECT * FROM employee WHERE id=?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Employee(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("department"),
                    rs.getDouble("salary")
                );
            }
        } catch (Exception e) {
            printSQLException(e);
        }
        return null;
    }

    // Add new employee
    public boolean addEmployee(Employee e) {
        String sql = "INSERT INTO employee (name, age, department, salary) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, e.getName());
            pstmt.setInt(2, e.getAge());
            pstmt.setString(3, e.getDepartment());
            pstmt.setDouble(4, e.getSalary());

            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (Exception ex) {
            printSQLException(ex);
        }
        return false;
    }

    // Update employee
    public boolean updateEmployee(Employee e) {
        String sql = "UPDATE employee SET name=?, age=?, department=?, salary=? WHERE id=?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, e.getName());
            pstmt.setInt(2, e.getAge());
            pstmt.setString(3, e.getDepartment());
            pstmt.setDouble(4, e.getSalary());
            pstmt.setInt(5, e.getId());

            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (Exception ex) {
            printSQLException(ex);
        }
        return false;
    }

    // Delete employee
    public boolean deleteEmployee(int id) {
        String sql = "DELETE FROM employee WHERE id=?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (Exception ex) {
            printSQLException(ex);
        }
        return false;
    }

    // Print SQL exceptions for debugging
    private void printSQLException(Exception ex) {
        if (ex instanceof SQLException) {
            SQLException sqlEx = (SQLException) ex;
            for (Throwable e : sqlEx) {
                if (e instanceof SQLException) {
                    System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                    System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                    System.err.println("Message: " + e.getMessage());
                    Throwable t = sqlEx.getCause();
                    while (t != null) {
                        System.out.println("Cause: " + t);
                        t = t.getCause();
                    }
                }
            }
        } else {
            ex.printStackTrace();
        }
    }
}
