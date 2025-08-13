package com.powernode.springboot.service.impl;

import com.powernode.springboot.bean.Account;
import com.powernode.springboot.exception.TransferException;
import com.powernode.springboot.repository.AccountMapper;
import com.powernode.springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.transform.TransformerException;

/**
 * ClassName:AccountServiceImpl
 * Description:
 * Author:dwj@
 * Datetime:2025/8/1121:51
 * version:1.0
 */
@Transactional
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public void transfer(String fromActNo, String toActNo, double money)  {
        Account fromAct = accountMapper.selectByActNo(fromActNo);
        if(fromAct.getBalance() <  money){
            throw  new TransferException("余额不足");
        }

        Account toAct = accountMapper.selectByActNo(toActNo);

        fromAct.setBalance(fromAct.getBalance() - money);
        toAct.setBalance(toAct.getBalance() + money);
        //更新数据库
         int count = accountMapper.update(fromAct);
         count += accountMapper.update(toAct);
         if(count != 2){
             throw  new TransferException( "转账失败");
         }
    }
}
