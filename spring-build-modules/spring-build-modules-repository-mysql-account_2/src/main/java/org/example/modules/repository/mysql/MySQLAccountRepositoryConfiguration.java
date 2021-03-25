package org.example.modules.repository.mysql;

import org.example.modules.repository.mysql.cache.AccountCacheConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@ComponentScan(basePackages = {"org.example.modules.repository.mysql"})
@MapperScan(basePackages = {"org.example.modules.repository.mysql.mapper"})
@Import(AccountCacheConfiguration.class)
//@org.mybatis.spring.annotation.MapperScan(basePackages = {"org.example.modules.repository.mysql.mapper"})
public class MySQLAccountRepositoryConfiguration {
}