package xw.service.impl;

import xw.dao1.UserDao;
import xw.dao1.impl.UserDaoImpl;
import xw.domain.PageBean;
import xw.domain.User;
import xw.service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService {
    // 创建一个dao对象
    private UserDao dao = new UserDaoImpl();

    /**
     *
     * @return
     */
    @Override
    public List<User> findAll() {
        // 调用Dao完成查询
        return dao.findAll();
    }


    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }


    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public void deleteUser(String id) {
        dao.delete(Integer.parseInt(id));
    }

    @Override
    public User findUserById(String id) {
        return dao.findById(Integer.parseInt(id));
    }

    @Override
    public void updateUser(User user) {
        dao.update(user);
    }

    @Override
    public void delSelectedUser(String[] ids) {
        if (ids != null && ids.length > 0) {
            // 1.遍历数组
            for (String id : ids) {
                // 2. 调用DAO的delete方法，根据id删除
                dao.delete(Integer.parseInt(id));
            }
        }
    }

    @Override
    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {
        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);

        // 当前页码为1时，如果点击上一页就一直让当前页为1
        if (currentPage <= 0) {
            currentPage = 1;
        }

        // 1.创建空的PageBean对象
        PageBean<User> pb = new PageBean<User>();

        // 2.设置参数
        pb.setCurrentPage(currentPage);
        pb.setRows(rows);

        // 3.调用dao查询总记录数
        int totalCount = dao.findTotalCount(condition);
        pb.setTotalCount(totalCount);

        // 4.调用dao查询List集合
        // 计算开始的记录索引
        int start = (currentPage - 1) * rows;
        List<User> list = dao.findByPage(start, rows, condition);
        pb.setList(list);

        // 5. 计算总页码
        int totalPage = (totalCount % rows) == 0 ? totalCount / rows : (totalCount / rows) + 1;
        pb.setTotalPage(totalPage);

        // 未能实现该功能
        // 当前页码为最后一页时，如果点击下一页就一直让当前页为最后一页
        if (currentPage >= totalPage) {
            pb.setCurrentPage(totalPage);
        }

        return pb;
    }
}
