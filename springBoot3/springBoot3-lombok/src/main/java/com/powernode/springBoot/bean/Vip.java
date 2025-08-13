package com.powernode.springBoot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * ClassName:Vip
 * Description:
 * Author:dwj@
 * Datetime:2025/8/612:21
 * version:1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vip  {
    private Long id;

    private String name;

    private String cardNumber;

    private String birth;

}

