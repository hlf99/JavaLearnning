package xw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    account表中 修改记录
 */
public class JDBCDemo03 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            // 3.获取sql执行对象
            stmt = conn.createStatement();
            // 4.定义sql
            String sql = "update account set balance = 500 where id = 2";
            // 5.执行sql
            int count = stmt.executeUpdate(sql);
            // 6.处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("修改成功");
            } else {
                System.out.println("修改失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7.释放资源
            // 要先判断Statement和Connection对象是否创建成功
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
