package test;

import com.neusoft.dao.IAccountDao;
import com.neusoft.dao.IUserDao;
import com.neusoft.domain.Account;
import com.neusoft.domain.AccountUser;
import com.neusoft.domain.User;
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
    private IAccountDao accountDao;

    // 在测试方法之前执行
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
//        userDao = sqlSession.getMapper(IUserDao.class);
        accountDao = sqlSession.getMapper(IAccountDao.class);
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
    public void testFindAllAccountUser()
    {

        List<AccountUser> aus = accountDao.findAllAccount();

        for (AccountUser au : aus)
        {
            System.out.println(au);
        }
    }

    @Test
    public void testFindAll(){

        List<Account> all = accountDao.findAll();

        for (Account a : all){
            System.out.println("每个账户的信息");
            System.out.println(a);
            System.out.println(a.getUser());
        }
    }

}