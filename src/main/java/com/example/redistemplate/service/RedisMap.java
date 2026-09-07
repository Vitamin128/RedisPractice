package com.example.redistemplate.service;

import com.example.redistemplate.dao.IputUserItem;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisMap {

    RedisTemplate<Object, Object> redisTemplate;

    RedisMap(RedisTemplate<Object, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void AddUserItem(IputUserItem item)
    {
        redisTemplate.opsForValue().set(item.getName(), item);
    }

}
