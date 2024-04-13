package com.lxy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    void redisT(){
        redisTemplate.opsForValue().set("name:3", "lxy");
        System.out.println(redisTemplate.opsForValue().get("name:1"));
    }
}
