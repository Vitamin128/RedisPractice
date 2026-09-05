package com.example.redistemplate.service;

import com.example.redistemplate.dao.IputUserItem;
//import com.example.redistemplate.dao.RankItem;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisService {


    final private StringRedisTemplate redisTemplate;

    RedisService(StringRedisTemplate RedisTemplate)
    {
        redisTemplate=RedisTemplate;
    }

    public void AddRankItem(IputUserItem item)
    {
        redisTemplate.opsForZSet().add("RankBoard",item.getName(),item.getScore());
        redisTemplate.opsForZSet().
    }

    public Long SearchRank(IputUserItem item)
    {
        return redisTemplate.opsForZSet().rank("RankBoard",item.getName());
    }
}
