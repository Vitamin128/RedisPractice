package com.example.redistemplate;

import com.example.redistemplate.dao.RankItem;
import com.example.redistemplate.service.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class RedisTemplateApplicationTests {


    @Autowired
    private RedisService redisService;

//    RedisTemplateApplicationTests(StringRedisTemplate stringRedisTemplate) {
//        this.stringRedisTemplate = stringRedisTemplate;
//    }

    @Test
    void contextLoads() {
        RankItem item=new RankItem();
        item.setName("甘初豪");
        item.setRank();
        redisService.AddRankItem();
    }

}
