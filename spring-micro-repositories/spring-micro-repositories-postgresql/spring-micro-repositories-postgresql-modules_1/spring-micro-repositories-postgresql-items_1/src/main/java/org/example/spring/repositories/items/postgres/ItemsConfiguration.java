package org.example.spring.repositories.items.postgres;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.items.postgres.mapper")
public class ItemsConfiguration {
}