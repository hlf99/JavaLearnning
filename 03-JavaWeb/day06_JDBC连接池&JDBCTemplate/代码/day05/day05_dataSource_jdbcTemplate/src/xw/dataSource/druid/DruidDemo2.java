package xw.dataSource.druid;

import xw.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *  使用新的工具类
 */
public class DruidDemo2 {
    public static void main(String[] args) {
        /**
         *  完成添加的操作：给account表添加一条数据
         */
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            // 1.获取连接
            conn = JDBCUtils.getConnection();
            // 2.定义sql
            String sql = "insert into account values(null, ?, ?)";
            // 3.获取PrepareStatement对象，也就是sql执行对象
            pstmt = conn.prepareStatement(sql);
            // 4.设置sql中的参数
            pstmt.setString(1, "wangwu");
            pstmt.setDouble(2, 3000);
            // 5.执行sql
            int count = pstmt.executeUpdate();
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 6.释放资源
            JDBCUtils.close(pstmt, conn);
        }
    }
}
