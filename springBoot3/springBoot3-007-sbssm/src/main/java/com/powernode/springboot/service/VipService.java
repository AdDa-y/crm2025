package com.powernode.springboot.service;

import com.powernode.springboot.bean.Vip;

import java.util.List;

/**
 * ClassName:VipService
 * Description:
 * Author:dwj@
 * Datetime:2025/8/517:11
 * version:1.0
 */
public interface VipService {
    /**
     * 保存会员信息
     * @param vip
     * @return
     */
    boolean save( Vip vip );

    /**
     * 查看会员列表
     * @return
     */

    List<Vip> findAll();
 }
