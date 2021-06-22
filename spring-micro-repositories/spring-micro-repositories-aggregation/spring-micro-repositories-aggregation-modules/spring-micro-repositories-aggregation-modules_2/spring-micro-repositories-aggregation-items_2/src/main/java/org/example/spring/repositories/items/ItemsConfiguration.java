package org.example.spring.repositories.items;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.items.mapper")
public class ItemsConfiguration {
}