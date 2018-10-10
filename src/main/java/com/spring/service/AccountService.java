package com.spring.service;

import com.spring.base.BaseService;
import com.spring.dao.AccountMapper;
import com.spring.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther zhangxuan
 * @date 2018/10/10
 * @time 23:40
 */
@Service
public class AccountService extends BaseService<Account> {

    @Autowired
    private AccountMapper accountMapper;
}
