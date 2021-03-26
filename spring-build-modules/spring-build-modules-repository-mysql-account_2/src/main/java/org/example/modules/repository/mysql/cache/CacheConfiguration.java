package org.example.modules.repository.mysql.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

@Configuration
@EnableCaching
@EnableConfigurationProperties({AccountCacheProperties.class,RoleCacheProperties.class})
@AutoConfigureAfter(RedisAutoConfiguration.class)
public class CacheConfiguration {
    public static final String ACCOUNT_CACHE_MANAGER = "accountCacheManager";
    public static final String ROLE_CACHE_MANAGER = "roleCacheManager";
    @Autowired
    private AccountCacheProperties accountCacheProperties;
    @Autowired
    private RoleCacheProperties roleCacheProperties;
    @Bean(ACCOUNT_CACHE_MANAGER)
    public RedisCacheManager accountCacheManager(RedisConnectionFactory redisConnectionFactory) {
        RedisCacheConfiguration cacheConfiguration =
                RedisCacheConfiguration.defaultCacheConfig()
                        .entryTtl(accountCacheProperties.getEntryTtl())
                        .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new
                                GenericJackson2JsonRedisSerializer()));
        return RedisCacheManager
                .builder(redisConnectionFactory)
                .cacheDefaults(cacheConfiguration).build();
    }

    @Bean(ROLE_CACHE_MANAGER)
    public RedisCacheManager roleCacheManager(RedisConnectionFactory redisConnectionFactory) {
        RedisCacheConfiguration cacheConfiguration =
                RedisCacheConfiguration.defaultCacheConfig()
                        .entryTtl(roleCacheProperties.getEntryTtl())
                        .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new
                                GenericJackson2JsonRedisSerializer()));
        return RedisCacheManager
                .builder(redisConnectionFactory)
                .cacheDefaults(cacheConfiguration).build();
    }

}