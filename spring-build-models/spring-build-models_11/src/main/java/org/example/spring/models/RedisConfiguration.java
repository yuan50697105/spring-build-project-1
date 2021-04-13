package org.example.spring.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.RedisSerializer;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class RedisConfiguration {
    public static final String CACHE_PATIENT = "patient";

    @Bean("redisTemplate")
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setKeySerializer(RedisSerializer.json());
        redisTemplate.setValueSerializer(RedisSerializer.json());
        redisTemplate.setHashKeySerializer(RedisSerializer.json());
        redisTemplate.setHashValueSerializer(RedisSerializer.json());
        redisTemplate.setConnectionFactory(factory);
        return redisTemplate;
    }

    @Bean("cacheManager")
    public RedisCacheManager cacheManager(RedisConnectionFactory factory) {
        return RedisCacheManager.builder()
                .cacheWriter(getCacheWriter(factory))
                .cacheDefaults(cacheDefaults(Duration.ofDays(1)))
                .withInitialCacheConfigurations(withInitialCacheConfigurations())
                .build();
    }

    private Map<String, RedisCacheConfiguration> withInitialCacheConfigurations() {
        HashMap<String, RedisCacheConfiguration> map = new HashMap<>();
        map.put(CACHE_PATIENT, cacheDefaults(Duration.ofHours(1)));
        return map;
    }

    private RedisCacheWriter getCacheWriter(RedisConnectionFactory factory) {
        return RedisCacheWriter.nonLockingRedisCacheWriter(factory);
    }

    private RedisCacheConfiguration cacheDefaults(Duration ttl) {
        RedisSerializationContext.SerializationPair<Object> objectSerializationPair = RedisSerializationContext.SerializationPair.fromSerializer(RedisSerializer.json());
        RedisSerializationContext.SerializationPair<String> keySerializationPair = RedisSerializationContext.SerializationPair.fromSerializer(RedisSerializer.string());
        return RedisCacheConfiguration.defaultCacheConfig().entryTtl(ttl).serializeValuesWith(objectSerializationPair).serializeKeysWith(keySerializationPair);
    }

}