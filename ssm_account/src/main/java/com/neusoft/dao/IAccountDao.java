package com.neusoft.dao;

import com.neusoft.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountDao
{
    // 查询所有账户信息
    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account(name,money) values (#{name},#{money})")
    public void saveAccount(Account account);

    @Update("update account set name = #{name} , money = #{money} where id = #{id}")
    public void updateAccount(Account account);

    @Delete("Delete from account where id = #{id}")
    public void deleteAccount(Integer id);

}
