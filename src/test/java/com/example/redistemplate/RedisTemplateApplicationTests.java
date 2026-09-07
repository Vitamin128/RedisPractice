package com.example.redistemplate;

import com.example.redistemplate.dao.IputUserItem;
import com.example.redistemplate.dao.OutPutItem;
import com.example.redistemplate.service.RedisMap;
import com.example.redistemplate.service.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.stream.RecordId;
import org.springframework.data.redis.core.*;
import tools.jackson.databind.json.JsonMapper;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

@SpringBootTest
class RedisTemplateApplicationTests {


//    @Autowired
//    private RedisService redisService;
//
//    @Autowired
//    private RedisMap redisMap;
//
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    @Autowired
//    private JsonMapper jsonMapper;

    @Test
    void contextLoads() {

//        IputUserItem iputUserItem = new IputUserItem();
//        iputUserItem.setName("Class1");
//        iputUserItem.setScore(20.0);
//        redisMap.AddUserItem(iputUserItem);
//        redisService.AddUserItem(iputUserItem);
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
//        SetOperations<String,> setOps = stringRedisTemplate.opsForStream();
//        setOps.add("USER_1","Team_1");
//        setOps.add("USER_1","Team_2");
//        setOps.add("USER_1","Team_3");
//        setOps.add("USER_1","Team_4");

//        setOps.add("USER_1","Team_5");
//        setOps.add("USER_1","Team_6");
//        setOps.add("USER_1","Team_7");
//        setOps.add("USER_1","Team_8");
//
//        System.out.println(setOps.remove("USER_1","Team_1"));
//        System.out.println();
//        setOps.remove("USER_1","Team_2");
//        System.out.println(setOps.isMember("USER_1","Team_3"));
//        Map<Object,Boolean>result=setOps.isMember("USER_1","Team_1","Team_2","Team_3");
//        System.out.println(result);
//        Long length=setOps.size("USER_1");
//        System.out.println(length);
//        String result=setOps.randomMember("USER_1");
//        List<String>result=setOps.pop("USER_1",2);
//        Set<String>result=setOps.distinctRandomMembers("USER_1",5);
//        setOps.add("USER_2","Team_1","Team_2","Team_3","Team_4");
//        System.out.println(result);
//        Set<String>result=setOps.intersect("USER_1","USER_2");
//        setOps.move("USER_2","Team_2","USER_1");
//        System.out.println(result);
//        setOps.intersectAndStore("USER_1","USER_2","USER_3");
//        Long length =setOps.unionAndStore("USER_1","USER_2","USER_4");
//        Set<String>result=setOps.difference("USER_1","USER_2");
//        System.out.println(result);
//        StreamOperations<String,Object,Object>StreamOps=stringRedisTemplate.opsForStream();
//        RecordId Id=StreamOps.add("STREAM_1",Map.of(
//                "KEY_1","101",
//                "KEY_2","102",
//                "KEY_3","103"
//        ));
//        System.out.println(Id);


    }


}
