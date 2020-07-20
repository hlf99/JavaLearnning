package xw.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 *  JDBC工具类 使用的是Durid连接池
 */
public class JDBCUtils {

    private static DataSource ds;

    static {
        try {
            // 1.加载配置文件
            Properties pro = new Properties();
            // 使用ClassLoader加载配置文件，获取到字节输入流
            InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            // 加载配置文件进内存
            pro.load(is);

            // 2.初始化连接池对象 创建一个连接池对象并赋给成员变量ds
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取连接池对象
     */
    public static DataSource getDataSource() {
        return ds;
    }

    /**
     * 获取连接Connection对象
     */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }

}
