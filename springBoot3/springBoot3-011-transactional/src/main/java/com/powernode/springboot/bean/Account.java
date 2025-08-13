package com.powernode.springboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName:Acocunt
 * Description:
 * Author:dwj@
 * Datetime:2025/8/1121:20
 * version:1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    //账户
    private  String actNo;
    //余额
    private Double balance;
}
