package ys.jdbc;

import java.sql.*;

public class TestJDBC01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        //mysql8.0.11中，需要在url后面加上“?useSSL=false&serverTimezone=Hongkong”
        String url="jdbc:mysql://localhost:3306/jdbctest";
        String username="root";
        String password="password";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement=connection.createStatement();
        String sql="select *from user";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
