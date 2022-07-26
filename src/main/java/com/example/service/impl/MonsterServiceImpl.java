package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.entity.Monster;
import com.example.mapper.MonsterMapper;
import com.example.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MonsterServiceImpl extends ServiceImpl<MonsterMapper,Monster> implements MonsterService {

}
