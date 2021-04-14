package org.example.spring.infrastructures.mysql;

import org.example.spring.infrastructures.mysql.cache.configuration.MybatisCacheConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@Import(MybatisCacheConfig.class)
@ComponentScan
@MapperScan(basePackages = "org.example.spring.infrastructures.mysql.*.mapper")
public class MySQLConfiguration {
}