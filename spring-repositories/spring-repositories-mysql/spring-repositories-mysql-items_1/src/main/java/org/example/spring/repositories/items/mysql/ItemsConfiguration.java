package org.example.spring.repositories.items.mysql;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.items.mysql.mapper")
public class ItemsConfiguration {
}