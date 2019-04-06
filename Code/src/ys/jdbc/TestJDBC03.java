package ys.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestJDBC03 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //mysql8.0.11中，需要在url后面加上“?useSSL=false&serverTimezone=Hongkong”
        String url = "jdbc:mysql://localhost:3306/jdbctest?" +
                "        useSSL=false&serverTimezone=Hongkong";
        String username = "root";
        String password = "password";
        Connection connection = DriverManager.getConnection(url, username, password);
        //像数据表中插入信息
        String sql = "insert into user (name,id) values (?,?)";
        PreparedStatement pStat = connection.prepareStatement(sql);
        for (int i = 0; i < 5; i++) {
            pStat.setString(1, "name" + i);
            pStat.setString(2, String.valueOf(i));
            //将设置的参数添加进批处理
            pStat.addBatch();
        }
        //执行批处理
        pStat.executeBatch();
        //关闭资源
        pStat.close();
        connection.close();
    }
}
