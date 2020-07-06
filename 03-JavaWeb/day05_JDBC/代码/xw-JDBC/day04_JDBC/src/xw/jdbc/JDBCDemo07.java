package xw.jdbc;

import java.sql.*;

/*
    执行DDL语句
 */
public class JDBCDemo07 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1. 注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2.获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
            // 3.获取sql执行对象
            stmt = conn.createStatement();
            // 4.定义sql
            String sql = "select * from account";
            // 5.执行sql
            rs = stmt.executeQuery(sql);
            // 6.处理结果
            // next()方法既可以让游标向下一行移动，也可以判断下一行是否有数据，返回值为true就是有，为false就是没有
            while (rs.next()) {
                // 6.1 循环判断结果集是否有下一行，也就是游标是否位于最后一行末尾
                // 6.2 获取数据
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);

                System.out.println(id + "---" + name + "---" + balance);
            }

            /*// 6.1 让游标向下移动一行
            if (rs.next()) {
                // 判断是否有数据
                // 6.2 获取数据
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);

                System.out.println(id + "---" + name + "---" + balance);
            }*/
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 7.释放资源
            // 要先判断Statement、Connection、ResultSet对象是否创建成功
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

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
