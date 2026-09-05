package com.example.redistemplate;

import com.example.redistemplate.dao.IputUserItem;
import com.example.redistemplate.service.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedisTemplateApplicationTests {


    @Autowired
    private RedisService redisService;


    @Test
    void contextLoads() {
        IputUserItem item = new IputUserItem();
        item.setName("小明");
        item.setScore(50.0);
        redisService.AddRankItem(item);
        System.out.println(redisService.SearchRank(item));

    }

}
