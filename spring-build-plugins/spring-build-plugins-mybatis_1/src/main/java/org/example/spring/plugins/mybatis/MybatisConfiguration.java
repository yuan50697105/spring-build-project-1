package org.example.spring.plugins.mybatis;

import com.baomidou.mybatisplus.core.config.GlobalConfig;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.github.Generator;
import org.example.spring.plugins.mybatis.audit.AuditInjector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfiguration {
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor() {
        return new PaginationInnerInterceptor();
    }

    @Bean
    public GlobalConfig config(Generator generator) {
        GlobalConfig config = new GlobalConfig();
        config.setMetaObjectHandler(new AuditInjector(generator));
        return config;
    }
}