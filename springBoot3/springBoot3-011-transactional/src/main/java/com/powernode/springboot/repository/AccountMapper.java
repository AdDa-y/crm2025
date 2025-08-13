package com.powernode.springboot.repository;

import com.powernode.springboot.bean.Account;

/**
 * ClassName:AccountMapper
 * Description:
 * Author:dwj@
 * Datetime:2025/8/1121:21
 * version:1.0
 */
public interface AccountMapper {
    //查询余额

    /**
     * 根据账号获取账户信息
     * @param ActNo
     * @return
     */
    Account selectByActNo(String ActNo);
    //更新账户

    /**
     * 更新账户，账号不能更新，其他字段可以更新
     * @param account
     * @return
     */
    int update(Account account);
}
