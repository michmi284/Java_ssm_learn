package com.neusoft.domain;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class Emp
{
    public static void main(String[] args) throws IOException
    {
        String resouce = "mybatis-config.xml";
        // 1. 根据SqlMapConfig.xml，读取资源
        InputStream inputStream = Resources.getResourceAsStream(resouce);
        // 2. 创建SqlSessionFactory，根据全局配置文件SqlMapConfig.xml创建工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3. 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Emp e = sqlSession.selectOne("com.neusoft.domain.Emp.getEmp");
        System.out.println(e.getMgrid());
//        sqlSession.close();

        //增
//        Emp emp = new Emp();
//        emp.setEmpid(6);
//        emp.setEname("111");
//        emp.setHiredate(new Date());
//        emp.setLogid("neu1");
//        emp.setLogpwd("123");
//        emp.setMgrid(3);
//
//        int i = sqlSession.insert("com.neusoft.domain.Emp.insertEmp",emp);
//
//        System.out.println(i);
//        sqlSession.commit();

        //改
//        Emp emp = new Emp();
//        emp.setEmpid(1);
//        emp.setEname("张3丰");
//        emp.setHiredate(new Date());
//        emp.setLogid("neu2");
//        emp.setLogpwd("123");
//        emp.setMgrid(0);
//
//        int i = sqlSession.update("com.neusoft.domain.Emp.updateEmp",emp);
//
//        System.out.println(i);
//        sqlSession.commit();

//删
        Emp emp = new Emp();
        emp.setEmpid(1);
//        emp.setEname("张3丰");
//        emp.setHiredate(new Date());
//        emp.setLogid("neu2");
//        emp.setLogpwd("123");
//        emp.setMgrid(0);
        int i = sqlSession.delete("com.neusoft.domain.Emp.deleteEmp",emp);
        System.out.println(i);
        sqlSession.commit();


        sqlSession.close();
    }


    private int empid;
    private String ename;
    private Date hiredate;
    private String logid;
    private String logpwd;
    private int mgrid;
    private Dept dept;

    public int getEmpid()
    {
        return empid;
    }

    public void setEmpid(int empid)
    {
        this.empid = empid;
    }

    public String getEname()
    {
        return ename;
    }

    public void setEname(String ename)
    {
        this.ename = ename;
    }

    public Date getHiredate()
    {
        return hiredate;
    }

    public void setHiredate(Date hiredate)
    {
        this.hiredate = hiredate;
    }

    public String getLogid()
    {
        return logid;
    }

    public void setLogid(String logid)
    {
        this.logid = logid;
    }

    public String getLogpwd()
    {
        return logpwd;
    }

    public void setLogpwd(String logpwd)
    {
        this.logpwd = logpwd;
    }

    public int getMgrid()
    {
        return mgrid;
    }

    public void setMgrid(int mgrid)
    {
        this.mgrid = mgrid;
    }

    public Dept getDept()
    {
        return dept;
    }

    public void setDept(Dept dept)
    {
        this.dept = dept;
    }

    @Override
    public String toString()
    {
        return "Emp{" +
                "empid=" + empid +
                ", ename='" + ename + '\'' +
                ", hiredate=" + hiredate +
                ", logid='" + logid + '\'' +
                ", logpwd='" + logpwd + '\'' +
                ", mgrid=" + mgrid +
                ", dept=" + dept +
                '}';
    }
}
