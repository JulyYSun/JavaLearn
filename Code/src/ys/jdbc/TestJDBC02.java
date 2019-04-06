package ys.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJDBC02 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //mysql8.0.11中，需要在url后面加上“?useSSL=false&serverTimezone=Hongkong”
        String url="jdbc:mysql://localhost:3306/jdbctest?" +
                "        useSSL=false&serverTimezone=Hongkong";
        String username="root";
        String password="password";
        Connection connection = DriverManager.getConnection(url, username, password);
        String sql="select *from user where name= ?";
        PreparedStatement pStat=connection.prepareStatement(sql);
        //设置sql语句参数
        pStat.setString(1,"ys");
        ResultSet resultSet = pStat.executeQuery();

        //遍历结果集
        while(resultSet.next()){
            System.out.println(resultSet.getString("id"));
        }

        //关闭资源
        resultSet.close();
        connection.close();
        pStat.close();
    }

}
