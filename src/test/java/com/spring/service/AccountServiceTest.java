package com.spring.service;

import com.spring.po.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"} )
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void AccountTest() throws Exception{
        Account account = accountService.queryById(8);
        System.out.println(account);
    }
}