package xw.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import xw.domain.User;
import xw.util.JDBCUtils;

/**
 *  操作数据库中User表的类
 */
public class UserDao {

    // 声明JDBCTemplate对象共享
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    /**
     * 登录方法
     * @param loginUser 传递过来的User对象中只有用户名和密码
     * @return  返回的User对象中包含了用户的所有信息 没有查询到则返回null
     */
    public User login(User loginUser) {
        try {
            // 1.编写sql
            String sql = "select * from user where username = ? and password = ?";
            // 调用query方法 将查询到的用户信息封装成User对象后返回
            /*
                该处封装User对象的方法queryForObject中的参数不清楚作用？
                queryForObject(String sql, RowMapper<T> rowMapper, Object... args)
                    查询给定的SQL以从SQL创建准备好的语句，并创建要绑定到查询的参数列表，并通过RowMapper将单个结果行映射到Java对象。
                BeanPropertyRowMapper(Class<T> mappedClass) 构造方法
                    创建一个新的BeanPropertyRowMapper对象，接受目标Bean中未填充的属性。
             */
            User user = template.queryForObject(sql,
                    new BeanPropertyRowMapper<User>(User.class),
                    loginUser.getUsername(), loginUser.getPassword());

            return user;
        } catch (DataAccessException e) {
            e.printStackTrace(); // 记录日志
            return null;
        }
    }
}
