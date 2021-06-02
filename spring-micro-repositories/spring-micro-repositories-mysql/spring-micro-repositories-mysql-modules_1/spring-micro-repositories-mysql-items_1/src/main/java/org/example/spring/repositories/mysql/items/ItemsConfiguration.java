package org.example.spring.repositories.mysql.items;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.mysql.items.mapper")
public class ItemsConfiguration {
}