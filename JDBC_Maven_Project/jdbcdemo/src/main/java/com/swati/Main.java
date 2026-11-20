package com.swati;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");

        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver loaded successfully!");

        String url = "jdbc:mysql://Localhost:3306/jdbc_demo_db";
        String username = "root";
        String password = "Swati@2001";
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection established successfully!");

        Statement stmt = con.createStatement();
        String sql_insert = "INSERT INTO employee VALUES (6,'Rita', 35)";
        int isExecuted = stmt.executeUpdate(sql_insert);
        System.out.println("Insert executed successfully! " + isExecuted);
        String sql_update = "UPDATE employee SET age=50 WHERE emp_id=3";
        int isUpdated = stmt.executeUpdate(sql_update);
        System.out.println("Update executed successfully! " + isUpdated); 
        
        String sql_delete = "DELETE FROM employee WHERE emp_id=6";
        int isDeleted = stmt.executeUpdate(sql_delete);
        System.out.println("Delete executed successfully! " + isDeleted);

        String sql_display = "SELECT * FROM employee";
        ResultSet rs = stmt.executeQuery(sql_display);
        System.out.println("Query executed successfully! Displaying the records:"+ rs);
        while (rs.next()) {
            int emp_id = rs.getInt(1); // or rs.getInt("emp_id")
            String name = rs.getString(2); // or rs.getString("name")
            int age = rs.getInt(3); // or rs.getInt("age")
            System.out.println(emp_id + "\t" + name + "\t\t" + age);
        }

        con.close();
        System.out.println("Connection closed successfully!");
    }
}