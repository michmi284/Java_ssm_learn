package test;

import com.neusoft.dao.IUSerDao;
import com.neusoft.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest2
{
    @Test
    public void test1() throws IOException
    {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂生产的SqlSession对象
        SqlSession session = factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        IUSerDao userDao = session.getMapper(IUSerDao.class);
        //5.使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user :
                users)
        {
            System.out.println(user);
        }
        //6.释放资源
        session.close();
    }
}
