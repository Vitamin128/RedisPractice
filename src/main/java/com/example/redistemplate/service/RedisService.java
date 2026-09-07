package com.example.redistemplate.service;

import com.example.redistemplate.dao.IputUserItem;
//import com.example.redistemplate.dao.RankItem;
import com.example.redistemplate.dao.OutPutItem;
import com.example.redistemplate.iterface.Redis;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Set;

@Service("RedisService")
public class RedisService implements Redis {


    final private StringRedisTemplate redisTemplate;

    RedisService(StringRedisTemplate RedisTemplate)
    {
        redisTemplate=RedisTemplate;
    }

    public boolean AddRankItem(IputUserItem item)
    {
        return redisTemplate.opsForZSet().add("RankBoard",item.getName(),item.getScore());
    }

    public Long SearchRank(String name)
    {
        return redisTemplate.opsForZSet().rank("RankBoard",name);
    }


    public ArrayList<OutPutItem> GetAllItem()
    {
        Set<ZSetOperations.TypedTuple<String>> tupleSet=redisTemplate.opsForZSet().reverseRangeWithScores("RankBoard",0,-1);
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

    public ArrayList<OutPutItem> GetAllItemLimit(int limit)
    {
        Set<ZSetOperations.TypedTuple<String>> tupleSet=redisTemplate.opsForZSet().reverseRangeWithScores("RankBoard",0,limit-1);
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
    public Long DeleteAllItems()
    {
//        redisTemplate.opsForHash().put();
        return redisTemplate.opsForZSet().removeRange("RankBoard",0,-1);
    }

    public Long DeleteSingleItem(String name)
    {
        return redisTemplate.opsForZSet().remove("RankBoard",name);
    }
}
