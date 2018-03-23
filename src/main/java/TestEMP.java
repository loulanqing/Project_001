import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import test.Dao.TestMapper;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by hcz on 2018-3-10.
 */

//执行SQL语句
public class TestEMP {
    public static void main(String[] args) throws IOException {
        SqlSession session=MyBatisUtil.getSqlSession();
        try {
            TestMapper testMapper = session.getMapper(TestMapper.class);
            test.domain.Test test = testMapper.selectByPrimaryKey((long)1);
            System.out.println(">>>>>>>>>>>>>>> " + test.getTe01());
            // do work
        } finally {
            session.commit(); //增删改必须提交事务
            session.close(); //释放session
        }
    }
}
