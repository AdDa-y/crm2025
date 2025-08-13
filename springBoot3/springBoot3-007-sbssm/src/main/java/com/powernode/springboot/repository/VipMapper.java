package com.powernode.springboot.repository;

import com.powernode.springboot.bean.Vip;

import java.util.List;

/**
 * ClassName:VipMapper
 * Description:
 * Author:dwj@
 * Datetime:2025/8/516:07
 * version:1.0
 */
public interface VipMapper  {
    /**
     * 保存会员信息，1为保存成功
     * @param vip
     * @return
     */
    int insert (Vip vip);

    /**
     * 查询所有的会员信息
     *
     * @return 会员列表
     */
    List<Vip > selectAll();
}
