package com.example.redistemplate;

import com.example.redistemplate.dao.IputUserItem;
import com.example.redistemplate.dao.OutPutItem;
import com.example.redistemplate.service.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import tools.jackson.databind.json.JsonMapper;

import java.lang.reflect.Array;
import java.util.*;

@SpringBootTest
class RedisTemplateApplicationTests {


    @Autowired
    private RedisService redisService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private JsonMapper jsonMapper;

    @Test
    void contextLoads() {
//        Map<Object, Object> userMap = new HashMap<>();
//        userMap.put("name", "李四");
//        userMap.put("age", "30");
//        userMap.put("email", "lisi@example.com");
//        List<Object>s1=new ArrayList<>();
//        s1=stringRedisTemplate.opsForHash().values("KEY_2");
//        System.out.println(s1);
//        List<Object>fields= new ArrayList<>();
//        fields.add("KEY_1");
//        fields.add("KEY_2");
//        fields.add("KEY_3");
//        List<Object>ret=stringRedisTemplate.opsForHash().multiGet("KEY_2",fields);
//        System.out.println(ret);
//        boolean ret=stringRedisTemplate.opsForHash().hasKey("KEY_2","KEY_1");
//        Double length=stringRedisTemplate.opsForHash().increment("KEY_2","age",2.8);

//        System.out.println(length);
//        Long deteted=stringRedisTemplate.opsForHash().delete("KEY_2","KEY_1","KEY_2");
//        System.out.println(deteted);

//        Cursor<Map.Entry<String,String>>cursor=stringRedisTemplate.opsForHash()
//                .scan("KEY_2", ScanOptions.scanOptions().build()).match()

//        stringRedisTemplate.opsForSet().
        SetOperations<String,String>setOps=stringRedisTemplate.opsForSet();
//        setOps.add("USER_1","Team_1");
//        setOps.add("USER_1","Team_2");
//        setOps.add("USER_1","Team_3");
//        setOps.add("USER_1","Team_4");
//
//        System.out.println(setOps.remove("USER_1","Team_1"));
//        System.out.println();
//        setOps.remove("USER_1","Team_2");
    }


}
