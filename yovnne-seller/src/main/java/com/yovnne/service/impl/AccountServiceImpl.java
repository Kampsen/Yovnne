package com.yovnne.service.impl;

import com.yovnne.dao.IAccountDao;
import com.yovnne.model.Account;
import com.yovnne.service.IAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Resource
    private IAccountDao accountDao;

    public Account getAccountById(int id) {
        return this.accountDao.selectByPrimaryKey(id);
    }
}
