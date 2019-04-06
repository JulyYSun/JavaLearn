package ys.jdbc.DBUtils;

import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class TestDBUtils {
    public static void main(String[] args) throws SQLException {
        //生成一个QueryRunner对象
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        //创建插入数据的sql语句
        String sql="insert into student(name,id,age,major) values(?,?,?,?)";
        //设置批量操作的参数，元素顺序要和sql中的属性顺序一致
        Object[][] param=new Object[5][];
        for(int i=0;i<5;i++){
            param[i]=new Object[]{"name"+i ,i,10+i,"java"};
        }
        queryRunner.batch(sql,param);
    }
}
