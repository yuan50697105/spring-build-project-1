package org.example.spring.daos.mysql;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.github.liuanxin.caches.MybatisRedisCache;
import com.github.liuanxin.caches.RedisContextUtils;
import org.example.spring.daos.mysql.auth.AuthConfiguration;
import org.example.spring.daos.mysql.customer.CustomerConfiguration;
import org.example.spring.daos.mysql.items.ItemsConfiguration;
import org.example.spring.daos.mysql.patient.PatientConfiguration;
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
@Import({MySQLConfiguration.MybatisCacheConfig.class, AuthConfiguration.class, CustomerConfiguration.class, ItemsConfiguration.class, PatientConfiguration.class})
@ComponentScan
@MapperScan(basePackages = "org.example.spring.daos.mysql.*.mapper")
public class MySQLConfiguration {
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
            interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
            return interceptor;
        }
    }


}