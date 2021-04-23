package org.example.spring.infrastructures.mysql;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.github.liuanxin.caches.MybatisRedisCache;
import com.github.liuanxin.caches.RedisContextUtils;
import org.apache.ibatis.cache.Cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.Pattern;

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
            redisTemplate.setHashKeySerializer(RedisSerializer.byteArray());
            redisTemplate.setHashValueSerializer(RedisSerializer.byteArray());
            redisTemplate.setKeySerializer(RedisSerializer.byteArray());
            redisTemplate.setValueSerializer(RedisSerializer.byteArray());
            redisTemplate.setConnectionFactory(connectionFactory);
            return redisTemplate;

        }
    }


    @Configuration
    public static class MybatisConfiguration {
        @Bean
        public MybatisPlusInterceptor mybatisPlusInterceptor() {
            MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
            interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
            return interceptor;
        }
    }



}