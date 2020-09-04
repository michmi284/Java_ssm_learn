package test;

import com.neusoft.dao.IUserDao;
import com.neusoft.domain.User;
import org.apache.ibatis.annotations.Select;
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


public class MybatisTest1 {
    private  InputStream in;
    private  SqlSession sqlSession;
    private  IUserDao userDao;
    // 在测试方法之前执行
    @Before
    public void init() throws IOException {
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
    public void destroy() throws IOException {
        // 提交事物
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
//    @Test
//    public void testFindAll(){
//        List<User> users = userDao.findAll();
//        for (User user : users){
//            System.out.println(user);
//        }
//    }
//
//    @Test
//    public void testFindOne(){
//        User user = userDao.findById(45);
//
//         System.out.println(user);
//
//    }
//    @Test
//    public void testSave(){
//        // 注意要提交事物
//        User user = new User();
//        user.setUsername("剑圣");
//        user.setBirthday(new Date());
//        user.setSex("男");
//        user.setAddress("War3");
//
//        System.out.println("保存之前"+ user);
//        int i = userDao.savaUser(user);
//        System.out.println("影响的行数" + i);
//        System.out.println("保存之后"+user);
//        System.out.println(user.getId());
//
//    }
//
//
//    @Test
//    public void testUpdate(){
//        // 注意要提交事物
//        User user = new User();
//        user.setId(49);
//        user.setUsername("斯温");
//        user.setBirthday(new Date());
//        user.setSex("男");
//        user.setAddress("Dota");
//
//        System.out.println("更新之前"+ user);
//        int i = userDao.updateUser(user);
//        System.out.println("影响的行数" + i);
//
//    }
//
//
//    @Test
//    public void testDelete(){
//        int res = userDao.deleteUser(48);
//        System.out.println("res"+ res);
//    }
//
//    @Test
//    public void testLikeName(){
//        List<User> users = userDao.findByName("%李%");
//        for(User user: users){
//            System.out.println(user);
//        }
//    }
//
//    @Test
//    public void testCount(){
//        int total = userDao.findTotal();
//        System.out.println(total);
//    }

    @Test
    public void testFindAll()
    {
        List<User>users = userDao.findAll();
        for (User user :
                users)
        {
            System.out.println(user);
        }
    }
    @Test
    public void testFindById()
    {
        User user = userDao.findById(49);
        System.out.println(user);
    }
@Test
    public void testSave()
{
    User user = new User();
    user.setUsername("艾欧");
    user.setSex("男");
    user.setBirthday(new Date());
    user.setAddress("Dota");

//    System.out.println("保存之前"+ user);
        userDao.saveUser(user);
//        System.out.println("影响的行数" + i);
//        System.out.println("保存之后"+user);
//        System.out.println(user.getId());
}
@Test
    public void testUpdate()
{
    User user = new User();
    user.setUsername("伊利丹");
    user.setSex("男");
    user.setBirthday(new Date());
    user.setAddress("warCraft");
    user.setId(52);
    userDao.updateUser(user);
}
@Test
    public void testDelete()
{
    userDao.deleteUser(52);
}
@Test
    public void testFindName()
{
    List<User>test = userDao.findName("%李%");
    System.out.println(test);
}
@Test
    public void testFindTotal()
{
    int a = userDao.findTotal();
    System.out.println(a);
}
}
