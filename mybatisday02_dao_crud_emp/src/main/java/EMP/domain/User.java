package EMP.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable
{
    private int num;
    private String name;
    private String work;
    private int mgr;
    private Date date;
    private int salary;
    private int com;
    private int dep;

    public int getNum()
    {
        return num;
    }

    public void setNum(int num)
    {
        this.num = num;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getWork()
    {
        return work;
    }

    public void setWork(String work)
    {
        this.work = work;
    }

    public int getMgr()
    {
        return mgr;
    }

    public void setMgr(int mgr)
    {
        this.mgr = mgr;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int getCom()
    {
        return com;
    }

    public void setCom(int com)
    {
        this.com = com;
    }

    public int getDep()
    {
        return dep;
    }

    public void setDep(int dep)
    {
        this.dep = dep;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", work='" + work + '\'' +
                ", mgr=" + mgr +
                ", date=" + date +
                ", salary=" + salary +
                ", com=" + com +
                ", dep=" + dep +
                '}';
    }
}
