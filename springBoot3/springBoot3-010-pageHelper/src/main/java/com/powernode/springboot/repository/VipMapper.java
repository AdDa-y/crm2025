package com.powernode.springboot.repository;

import com.powernode.springboot.bean.Vip;

import java.util.List;

public interface VipMapper {

    List<Vip> selectAll();
}