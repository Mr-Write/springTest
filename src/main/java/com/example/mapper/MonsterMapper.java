package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.entity.Monster;
import org.apache.ibatis.annotations.Mapper;


public interface MonsterMapper extends BaseMapper<Monster> {
    public Monster getMonster(Integer id);
}
