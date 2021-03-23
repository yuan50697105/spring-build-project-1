package org.example.modules.repository.mysql.account.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@ComponentScan
@MapperScan(basePackages = {"org.example.modules.repository.mysql.account.mapper"})
@org.mybatis.spring.annotation.MapperScan(basePackages = {"org.example.modules.repository.mysql.account.mapper"})
public class MySQLAccountRepositoryConfiguration {
}