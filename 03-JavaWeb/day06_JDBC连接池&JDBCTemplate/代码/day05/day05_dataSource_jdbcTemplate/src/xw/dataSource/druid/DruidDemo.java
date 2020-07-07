package xw.dataSource.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 *  Druid演示
 */
public class DruidDemo {
    public static void main(String[] args) throws Exception {
        // 1.导入jar包
        // 2.定义配置文件
        // 3.加载配置文件
        // 创建一个Properties集合
        Properties prop = new Properties();
        // 使用类加载器将指定配置文件加载进内存
        InputStream is = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        prop.load(is);
        // 4.获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(prop);

        // 5.获取连接
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
