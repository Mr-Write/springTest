package com.example.controller;

import com.example.entity.Monster;
import com.example.service.MonsterService;
import com.example.service.impl.MonsterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    private MonsterService monsterService;
    @Autowired
    private Monster monster;
    @RequestMapping("/getMonster")
    @ResponseBody
    public Monster getMonster(@RequestParam("id") Integer id){
        return monsterService.getById(id);
    }
    @RequestMapping("monster")
    @ResponseBody
    public Monster show(){
        return monster;
    }
}
