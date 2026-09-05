package com.example.redistemplate.controller;


import com.example.redistemplate.dao.OutPutItem;
import com.example.redistemplate.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RedisBoard {

    @Autowired
    RedisService redisService;

    @GetMapping("/getallitem")
    ArrayList<OutPutItem> GetAllItem()
    {
        return redisService.GetAllItem();
    }

    @GetMapping("/getrank/{name}")
    Long GetRoleRank(@PathVariable String name)
    {
        return redisService.SearchRank(name)+1;
    }
}
