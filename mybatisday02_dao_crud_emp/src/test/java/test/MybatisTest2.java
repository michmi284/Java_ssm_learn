package test;

import EMP.dao.IUserDao;
import EMP.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MybatisTest2
{
    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;

    @Before
    public void init() throws IOException
    {
        // 1. 读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 2. 创建 SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        // 3. 使用 工厂生产的 SqlSession对象
        sqlSession = factory.openSession();
        // 4. 使用SqlSession 创建Dao 接口 的代理对象
        userDao = sqlSession.getMapper(IUserDao.class);
    }

    @After
    public void destroy() throws IOException
    {
        // 提交事物
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void testFindAll()
    {
        List<User> user = userDao.findAll();
        for (User users : user
        )
        {
            System.out.println(users);
        }
    }

    @Test
    public void testFIndById()
    {
        User user = userDao.findById(7369);
        System.out.println(user);
    }

    @Test
    public void testInsertUser()
    {
        User user = new User();
        user.setEMPNO(88888);
        user.setENAME("卡尔");
        user.setJOB("MAGE");
        user.setMGR(8888);
        user.setHIREDATE(new Date());
        user.setSAL(88888);
        user.setCOMM(88888);
        user.setDEPTNO(88888);

        userDao.insertUser(user);
    }

    @Test
    public void testUpdateUser()
    {
        User user = new User();
        user.setEMPNO(99999);
        user.setENAME("米波");
        user.setJOB("paladin");
        user.setMGR(7777);
        user.setHIREDATE(new Date());
        user.setSAL(77777);
        user.setCOMM(77777);
        user.setDEPTNO(77777);

        userDao.updateUser(user);
    }

    @Test
    public void testDeleteUser()
    {
        userDao.deleteUser(7369);
    }

    @Test
    public void testFindLikeName()
    {
        List<User> users = userDao.findLikeName("A%");
        System.out.println(users);
    }
@Test
    public void testCount()
{
    int count = userDao.count();
    System.out.println(count);
}

}
