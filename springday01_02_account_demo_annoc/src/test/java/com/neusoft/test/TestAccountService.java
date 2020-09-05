package com.neusoft.test;

import com.neusoft.domain.Account;
import com.neusoft.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestAccountService
{
    ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
    //    IAccountService as = ac.getBean("accountService", IAccountService.class);
    IAccountService as = ac.getBean("accountService", IAccountService.class);
    @Test
    public void testFindAll()
    {
//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService as = ac.getBean("accountService", IAccountService.class);
//        IAccountService as = ac.getBean("accountService", IAccountService.class);
        List<Account> allAccount = as.findAllAccount();
        for (Account account :
                allAccount)
        {
            System.out.println(account);
        }
    }

    @Test
    public void testFindAccountById()
    {
//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService as = ac.getBean("accountService", IAccountService.class);
        Account a = as.findAccountById(1);
        System.out.println(a);
    }

    @Test
    public void testSaveAccount()
    {
//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService as = ac.getBean("accountService", IAccountService.class);
        Account account = new Account();
        account.setId(5);
        account.setName("卡尔");
        account.setMoney(10000.0f);
        as.saveAccount(account);
    }

    @Test
    public void testUpdateAccount()
    {
//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService as = ac.getBean("accountService", IAccountService.class);
        Account account = new Account();
        account.setId(5);
        account.setName("德鲁伊");
        account.setMoney(20000.0f);
        as.updateAccount(account);
    }

    @Test
    public void testDeleteAccount()
    {
//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
//        IAccountService as = ac.getBean("accountService", IAccountService.class);
        as.deleteAccount(5);
    }
}
