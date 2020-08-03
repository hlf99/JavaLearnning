package xw.dao1.impl;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import xw.dao1.UserDao;
import xw.domain.User;
import xw.util.JDBCUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserDaoImpl implements UserDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        // 使用JDBC操作数据库
        // 1.定义sql
        String sql = "select * from user";
        // 2.将查询出来的数据封装为list集合
        // new BeanPropertyRowMapper<User>(User.class)
        // 加上泛型User是为了向下兼容   User.class指定对应的字节码的class类型
        List<User> users = template.query(sql, new BeanPropertyRowMapper<User>(User.class));

        return users;
    }

    @Override
    public User findUserByUsernameAndPassword(String username, String password) {
            try {
            String sql = "select * from user where username = ? and password = ?";
            User user = template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), username, password);
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public void add(User user) {
        // 1.定义sql
        String sql = "insert into user values(null, ?, ?, ?, ?, ?, ?, null, null)";
        // 2.执行sql
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail());
    }

    @Override
    public void delete(int id) {
        // 1.定义sql
        String sql = "delete from user where id = ?";
        // 2.执行sql
        template.update(sql, id);
    }

    @Override
    public User findById(int id) {
        String sql = "select * from user where id = ?";
        return template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
    }

    @Override
    public void update(User user) {
        String sql = "update user set name = ?, gender = ?, age = ?, address = ?, qq = ?, email = ? where id = ?";
        template.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail(), user.getId());
    }

    @Override
    public int findTotalCount(Map<String, String[]> condition) {
        // 1.定义模板初始化sql
        String sql = "select count(*) from user where 1 = 1";
        StringBuilder sb = new StringBuilder(sql);
        // 2.遍历map
        Set<String> keySet = condition.keySet();
        // 定义参数的集合
        List<Object> params = new ArrayList<Object>();
        for (String key : keySet) {
            // 排除分页条件参数
            if ("currentPage".equals(key) || "rows".equals(key)) {
                continue;
            }

            // 获取value
            String value = condition.get(key)[0];
            // 判断value是否有值
            if (value != null && !"".equals(value)) {
                // 有值
                sb.append(" and " + key + " like ? ");
                params.add("%" + value + "%"); // ?条件的值
            }
        }
        System.out.println(sb.toString());
        System.out.println(params);

        // 返回一个Integer类型的数据，然后会自动拆箱为int类型
        return template.queryForObject(sb.toString(), Integer.class, params.toArray());
    }

    @Override
    public List<User> findByPage(int start, int rows, Map<String, String[]> condition) {
        String sql = "select * from user where 1 = 1";

        StringBuilder sb = new StringBuilder(sql);
        // 2.遍历map
        Set<String> keySet = condition.keySet();
        // 定义参数的集合
        List<Object> params = new ArrayList<Object>();
        for (String key : keySet) {
            // 排除分页条件参数
            if ("currentPage".equals(key) || "rows".equals(key)) {
                continue;
            }

            // 获取value
            String value = condition.get(key)[0];
            // 判断value是否有值
            if (value != null && !"".equals(value)) {
                // 有值
                sb.append(" and " + key + " like ? ");
                params.add("%" + value + "%"); // ?条件的值
            }
        }

        // 添加分页查询
        sb.append(" limit ?, ?");
        // 添加分页查询的参数
        params.add(start);
        params.add(rows);
        sql = sb.toString();
        System.out.println(sql);
        System.out.println(params);

        return template.query(sql, new BeanPropertyRowMapper<User>(User.class), params.toArray());
    }
}
