package org.example.modules.repository.mysql.cache;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;

@Configuration
@EnableCaching
@EnableConfigurationProperties(AccountCacheProperties.class)
@AutoConfigureAfter(RedisAutoConfiguration.class)
public class AccountCacheConfiguration {
    public static final String ACCOUNT_CACHE_MANAGER = "accountCacheManager";
    @Autowired
    private AccountCacheProperties properties;

    @Bean(ACCOUNT_CACHE_MANAGER)
    public RedisCacheManager accountCacheManager(RedisConnectionFactory redisConnectionFactory) {
        RedisCacheConfiguration cacheConfiguration =
                RedisCacheConfiguration.defaultCacheConfig()
                        .entryTtl(properties.getEntryTtl())   // 设置缓存过期时间为一天
                        .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new
                                GenericJackson2JsonRedisSerializer()));
        return RedisCacheManager.builder(redisConnectionFactory).cacheDefaults(cacheConfiguration).build();     // 设置默认的cache组件
    }

    private Converter<Object, String> getObjectStringConverter(ObjectMapper objectMapper) {
        return source -> {
            try {
                return objectMapper.writeValueAsString(source);
            } catch (JsonProcessingException e) {
                return source.toString();
            }

        };
    }
}