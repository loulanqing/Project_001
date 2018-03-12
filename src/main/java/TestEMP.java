import org.apache.ibatis.session.SqlSession;
import test.Dao.TestMapper;
import userMapper.Test;
import userMapper.User;
import userMapper.UserDao;

import java.io.IOException;

/**
 * Created by hcz on 2018-3-10.
 */

//执行SQL语句
public class TestEMP {
    public static void main(String[] args) throws IOException {
        SqlSession session=MyBatisUtil.getSqlSession();
        try {
            UserDao mapper = session.getMapper(UserDao.class);
            Test test = mapper.selectBlog(1);
            System.out.println(">>>>>>>>>>>>>>> " + test.getTe01());
            // do work
        } finally {
            session.commit(); //增删改必须提交事务
            session.close(); //释放session
        }
    }
}
