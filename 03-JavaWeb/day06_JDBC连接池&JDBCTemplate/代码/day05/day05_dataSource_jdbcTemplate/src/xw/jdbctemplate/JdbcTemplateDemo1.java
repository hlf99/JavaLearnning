package xw.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import xw.utils.JDBCUtils;

/**
 *  JdbcTemplate入门
 */
public class JdbcTemplateDemo1 {
    public static void main(String[] args) {
        // 1.导入jar包
        // 2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        // 3.调用方法
        // 定义sql
        String sql =  "update account set balance = ? where id = ?";
        // 执行sql
        int count = template.update(sql, 5000, "3");
        // 执行结果
        System.out.println(count);
    }
}
