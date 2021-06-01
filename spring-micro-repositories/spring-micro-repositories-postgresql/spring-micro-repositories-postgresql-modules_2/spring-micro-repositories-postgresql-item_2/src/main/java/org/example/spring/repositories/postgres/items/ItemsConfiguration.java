package org.example.spring.repositories.postgres.items;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.postgres.items.mapper")
public class ItemsConfiguration {
}