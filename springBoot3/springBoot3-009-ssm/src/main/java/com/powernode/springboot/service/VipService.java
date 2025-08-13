package com.powernode.springboot.service;

import com.powernode.springboot.bean.Vip;

/**
 * ClassName:VipService
 * Description:
 * Author:dwj@
 * Datetime:2025/8/616:13
 * version:1.0
 */
public interface VipService {
    /**
     * 根据会员的卡号查询用户的信息
     * @param cardNumber
     * @return
     */
    Vip findByCardNumber(String cardNumber);
}
