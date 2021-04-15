package org.example.spring.infrastructures.mysql;

import com.github.liuanxin.caches.MybatisRedisCache;
import com.github.liuanxin.caches.RedisContextUtils;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@Import(MySQLConfiguration.MybatisCacheConfig.class)
@ComponentScan
@MapperScan(basePackages = "org.example.spring.infrastructures.mysql.*.mapper")
public class MySQLConfiguration {
    @Configuration
    @ConditionalOnClass({ MybatisRedisCache.class, RedisTemplate.class })
    public static class MybatisCacheConfig {
        @Bean
        public RedisContextUtils setupCacheContext() {
            return new RedisContextUtils();
        }

        @Bean("redisTemplate")
        public RedisTemplate<Object,Object> redisTemplate(RedisConnectionFactory connectionFactory) {
            RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();
            redisTemplate.setHashKeySerializer(RedisSerializer.java());
            redisTemplate.setHashValueSerializer(RedisSerializer.json());
            redisTemplate.setKeySerializer(RedisSerializer.json());
            redisTemplate.setValueSerializer(RedisSerializer.json());
            redisTemplate.setConnectionFactory(connectionFactory);
            return redisTemplate;

        }
    }

}