package ys.jdbc.student;

import java.sql.*;

public class JDBCUtils {
    static String url = "jdbc:mysql://localhost:3306/jdbctest?" +
            "useSSL=false&serverTimezone=Hongkong";
    static String username = "root";
    static String password = "password";
    static Connection connection=null;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection= DriverManager.getConnection(url,username,password);
        }catch (Exception ex){
            ex.printStackTrace();
            throw new RuntimeException("数据库连接失败");
        }
    }
    //获取连接
    public static Connection getConnection(){
        return connection;
    }
    public static void release(Connection connection, PreparedStatement pStat, ResultSet resultSet){
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            resultSet=null;
        }
        release(connection,pStat);
    }

    public static void release(Connection connection, PreparedStatement pStat) {
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            connection=null;
        }
        if(pStat!=null){
            try {
                pStat.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            pStat=null;
        }
    }

}








