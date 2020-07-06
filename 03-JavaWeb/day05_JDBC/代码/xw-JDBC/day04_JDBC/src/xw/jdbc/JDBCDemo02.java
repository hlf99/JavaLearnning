package xw.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    account表 添加一条记录，使用insert语句
 */
public class JDBCDemo02 {
    public static void main(String[] args) {
        // 将Connection和Statement对象的作用域提升到全局作用域
        Connection conn = null;
        Statement stmt = null;
        try {
            // 1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.定义sql
            String sql = "insert into account values(null, 'wangwu', 3000)";
            // 3.获取数据库连接Connection对象
            conn = DriverManager.getConnection("jdbc:mysql:///db3", "root", "root");
            // 4.获取执行sql语句的Statement对象
            stmt = conn.createStatement();
            // 执行sql语句
            int count = stmt.executeUpdate(sql); // 影响的行数
            // 处理结果
            System.out.println(count);
            if (count > 0) {
                System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 先释放stmt，因为stmt是由conn获取到的
            // 为避免Statement或Connection对象创建失败而造成的空指针异常，要在释放资源前先进行判断
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
