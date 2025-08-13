package com.powernode.springboot.service;

import javax.xml.transform.TransformerException;

/**
 * ClassName:AccountService
 * Description:
 * Author:dwj@
 * Datetime:2025/8/1121:49
 * version:1.0
 */
public interface AccountService {
    /**
     * 转账的业务方法
     * @param fromActNo 转出账号
     * @param toActno 转入账户
     * @param money 转账金额
     */
    void transfer(String fromActNo, String toActno ,double money) throws TransformerException;
}
