package com.example.redistemplate.controller;


import com.example.redistemplate.dao.IputUserItem;
import com.example.redistemplate.dao.OutPutItem;
import com.example.redistemplate.iterface.Redis;
import com.example.redistemplate.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class RedisBoard {

    @Autowired
    RedisService redisService;

    @Autowired
    private Map<String, Redis> redisMap;

    @GetMapping("/get/all/item")
    ArrayList<OutPutItem> GetAllItem() {

        return redisMap.get("RedisService").GetAllItem();
    }

    @GetMapping("/get/all/item/{limit}")
    ArrayList<OutPutItem> GetAllItem(@PathVariable int limit) {
        return redisMap.get("RedisService").GetAllItemLimit(limit);
    }

    @GetMapping("/get/rank/{name}")
    Long GetRoleRank(@PathVariable String name) {
        return redisMap.get("RedisService").SearchRank(name) + 1;
    }

    @PostMapping("/add/item")
    boolean AddRankItem(@Validated @RequestBody IputUserItem dto) {
        return redisMap.get("RedisService").AddRankItem(dto);
    }

    @GetMapping("/remove/all")
    Long RemoveAllItems() {

        return redisMap.get("RedisService").DeleteAllItems();
    }

    @GetMapping("/remove/{name}")
    Long RemoveSingleItem(@PathVariable String name) {

        return redisMap.get("RedisService").DeleteSingleItem(name);
    }
}
