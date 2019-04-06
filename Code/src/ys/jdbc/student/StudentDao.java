package ys.jdbc.student;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDao {
    public boolean insert(Student student){
        boolean flag=false;
        PreparedStatement pStat=null;
        Connection connection=JDBCUtils.getConnection();
        String sql="insert into student(name,id,age,major) values(?,?,?,?)";
        try {
            pStat=connection.prepareStatement(sql);
            pStat.setString(1,student.getName());
            pStat.setInt(3,student.getAge());
            pStat.setInt(2,student.getId());
            pStat.setString(4,student.getMajor());
            int num=pStat.executeUpdate();
            if(num>0){
                flag=true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.release(connection,pStat);
        }

        return flag;
    }
}
