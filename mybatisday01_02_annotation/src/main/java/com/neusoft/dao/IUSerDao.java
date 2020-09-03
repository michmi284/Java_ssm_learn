package com.neusoft.dao;

import com.neusoft.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IUSerDao
{
    //查询所有
//    @Select("select * from user")
//    public List<User> findAll();
    @Select("select * from user")
    public List<User>findAll();
}
