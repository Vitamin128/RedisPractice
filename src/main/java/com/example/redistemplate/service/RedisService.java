package com.example.redistemplate.service;

import com.example.redistemplate.dao.RankItem;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {


    final private RedisTemplate<String, RankItem> redisTemplate;

    RedisService(RedisTemplate<String,RankItem> RedisTemplate)
    {
        redisTemplate=RedisTemplate;
    }

    public void AddRankItem(RankItem item)
    {
        redisTemplate.opsForZSet().add("RankBanks",item,item.getScore());
    }
}
