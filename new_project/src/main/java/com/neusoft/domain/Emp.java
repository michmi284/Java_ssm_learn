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
    public static void main(String[] args)
    {  String resouce = "mybatis-config.xml";
        // 1. 根据SqlMapConfig.xml，读取资源
        InputStream inputStream = null;
        try
        {
            inputStream = Resources.getResourceAsStream(resouce);
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        // 2. 创建SqlSessionFactory，根据全局配置文件SqlMapConfig.xml创建工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3. 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Emp e =  sqlSession.selectOne("com.ttc.po.Emp.getEmp");
        System.out.println(e.getMgrid());
        sqlSession.close();

    }

    private int empid;
    private String ename;
    private Date hiredate;
    private String logid;
    private String logpwd;
    private int mgrid;

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
                '}';
    }
}
