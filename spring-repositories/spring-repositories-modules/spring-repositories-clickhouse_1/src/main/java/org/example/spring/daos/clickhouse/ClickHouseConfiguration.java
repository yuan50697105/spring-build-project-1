package org.example.spring.repositories.clickhouse;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
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
@Import(ClickHouseConfiguration.MybatisCacheConfig.class)
@ComponentScan
@MapperScan(basePackages = "org.example.spring.repositories.mysql.*.mapper")
public class ClickHouseConfiguration {
    @Configuration
    @ConditionalOnClass({MybatisRedisCache.class, RedisTemplate.class})
    public static class MybatisCacheConfig {
        @Bean
        public RedisContextUtils setupCacheContext() {
            return new RedisContextUtils();
        }

        @Bean("redisTemplate")
        public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
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
            interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.CLICK_HOUSE));
            return interceptor;
        }
    }


}