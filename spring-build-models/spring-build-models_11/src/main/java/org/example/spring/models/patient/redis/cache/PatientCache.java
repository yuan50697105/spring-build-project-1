package org.example.spring.models.patient.redis.cache;

import lombok.AllArgsConstructor;
import org.example.spring.infrastructures.mysql.patient.entity.result.Patient;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PatientCache {
    private final RedisTemplate<String, Object> redisTemplate;
    private final RedisCacheManager cacheManager;

}