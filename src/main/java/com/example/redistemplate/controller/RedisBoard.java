package com.example.redistemplate.controller;


import com.example.redistemplate.dao.IputUserItem;
import com.example.redistemplate.dao.OutPutItem;
import com.example.redistemplate.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RedisBoard {

    @Autowired
    RedisService redisService;

    @GetMapping("/get/all/item")
    ArrayList<OutPutItem> GetAllItem()
    {
        return redisService.GetAllItem();
    }

    @GetMapping("/get/all/item/{limit}")
    ArrayList<OutPutItem> GetAllItem(@PathVariable int limit)
    {
        return redisService.GetAllItemLimit(limit);
    }

    @GetMapping("/get/rank/{name}")
    Long GetRoleRank(@PathVariable String name)
    {
        return redisService.SearchRank(name)+1;
    }

    @PostMapping("/add/item")
    boolean AddRankItem(@Validated @RequestBody IputUserItem dto)
    {
        return redisService.AddRankItem(dto);
    }

    @GetMapping("/remove/all")
    Long RemoveAllItems()
    {
        return redisService.DeleteAllItems();
    }

    @GetMapping("/remove/{name}")
    Long RemoveSingleItem(@PathVariable String name)
    {
        return redisService.DeleteSingleItem(name);
    }
}
