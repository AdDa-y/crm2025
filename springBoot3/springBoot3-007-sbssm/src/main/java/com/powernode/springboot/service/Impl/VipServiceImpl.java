package com.powernode.springboot.service.Impl;

import com.powernode.springboot.bean.Vip;
import com.powernode.springboot.repository.VipMapper;
import com.powernode.springboot.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:VipServiceImpl
 * Description:
 * Author:dwj@
 * Datetime:2025/8/517:13
 * version:1.0
 */
@Service
public class VipServiceImpl implements VipService {
    @Autowired
    private VipMapper vipMapper;

    @Override
    public boolean save(Vip vip) {

        return  vipMapper.insert(vip) == 1 ;
    }

    @Override
    public List<Vip> findAll() {
        return  vipMapper.selectAll();
    }
}
