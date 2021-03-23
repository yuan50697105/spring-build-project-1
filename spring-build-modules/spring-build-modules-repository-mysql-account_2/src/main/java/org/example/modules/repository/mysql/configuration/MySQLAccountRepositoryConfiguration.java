package org.example.modules.repository.mysql.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@ComponentScan
@MapperScan(basePackages = {"org.example.modules.repository.mysql.mapper"})
@org.mybatis.spring.annotation.MapperScan(basePackages = {"org.example.modules.repository.mysql.mapper"})
public class MySQLAccountRepositoryConfiguration {
}