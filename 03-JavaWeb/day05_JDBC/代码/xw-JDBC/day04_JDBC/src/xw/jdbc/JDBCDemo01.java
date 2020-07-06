package xw.jdbc;

/*
    JDBC快速入门
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo01 {
    public static void main(String[] args) throws Exception {
        // 1.导入驱动jar包
        // 2.注册驱动
        // 把Driver类通过Class.forName的方式加载进内存
        Class.forName("com.mysql.jdbc.Driver");
        // 3.获取数据库的连接对象
        // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
        Connection conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
        // 4.定义一个sql语句
        // String sql = "update account set balance = 5000 where id = 1";
        String sql = "update account set balance = 1000";
        // 5.获取执行sql的对象，Statement
        Statement stmt = conn.createStatement();
        // 6.执行sql
        int count = stmt.executeUpdate(sql);
        // 7.处理结果
        System.out.println(count);
        // 8.释放资源
        stmt.close();
        conn.close();
    }
}
