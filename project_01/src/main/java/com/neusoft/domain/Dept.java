package com.neusoft.domain;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

public class Dept
{
    public static void main(String[] args) throws IOException
    {

    }



    private Integer deptid;
    private String dname;
    private List<Emp> les;

    public Integer getDeptid()
    {
        return deptid;
    }

    public void setDeptid(Integer deptid)
    {
        this.deptid = deptid;
    }

    public String getDname()
    {
        return dname;
    }

    public void setDname(String dname)
    {
        this.dname = dname;
    }

    public List<Emp> getLes()
    {
        return les;
    }

    public void setLes(List<Emp> les)
    {
        this.les = les;
    }

    @Override
    public String toString()
    {
        return "Dept{" +
                "deptid=" + deptid +
                ", dname='" + dname + '\'' +
                ", les=" + les +
                '}';
    }
}
