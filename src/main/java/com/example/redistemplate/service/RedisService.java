package com.example.redistemplate.service;

import com.example.redistemplate.dao.IputUserItem;
//import com.example.redistemplate.dao.RankItem;
import com.example.redistemplate.dao.OutPutItem;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Set;

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
    }

    public Long SearchRank(String name)
    {
        return redisTemplate.opsForZSet().rank("RankBoard",name);
    }


    public ArrayList<OutPutItem> GetAllItem()
    {
        Set<String>items=redisTemplate.opsForZSet().reverseRange("RankBoard",0,-1);
        Set<ZSetOperations.TypedTuple<String>> tupleSet=redisTemplate.opsForZSet().rangeWithScores("RankBoard",0,-1);
        long i=1L;
        ArrayList<OutPutItem>Array=new ArrayList<>();
        for(ZSetOperations.TypedTuple<String> item:tupleSet)
        {
            OutPutItem outPutItem=new OutPutItem();
            outPutItem.setName(item.getValue());
            outPutItem.setScore(item.getScore());
            outPutItem.setRank(i++);
            Array.add(outPutItem);
        }
        return Array;
    }
}
