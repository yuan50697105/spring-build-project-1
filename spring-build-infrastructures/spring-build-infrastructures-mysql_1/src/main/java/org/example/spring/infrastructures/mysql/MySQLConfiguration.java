package org.example.spring.infrastructures.mysql;

import com.github.liuanxin.caches.MybatisRedisCache;
import com.github.liuanxin.caches.RedisContextUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
@ConditionalOnClass({ MybatisRedisCache.class, RedisTemplate.class })
public class MySQLConfiguration {
    @Bean
    public RedisContextUtils setupCacheContext() {
        return new RedisContextUtils();
    }
}