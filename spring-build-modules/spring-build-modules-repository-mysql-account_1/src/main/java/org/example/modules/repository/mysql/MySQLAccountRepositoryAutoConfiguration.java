package org.example.modules.repository.mysql;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@ComponentScan(basePackages = {"org.example.modules.repository.mysql"})
@MapperScan(basePackages = {"org.example.modules.repository.mysql.mapper"})
@EnableCaching
//@org.mybatis.spring.annotation.MapperScan(basePackages = {"org.example.modules.repository.mysql.mapper"})
public class MySQLAccountRepositoryAutoConfiguration {
}