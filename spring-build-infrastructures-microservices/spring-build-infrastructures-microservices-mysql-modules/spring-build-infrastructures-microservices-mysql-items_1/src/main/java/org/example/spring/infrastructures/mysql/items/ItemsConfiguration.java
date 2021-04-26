package org.example.spring.infrastructures.mysql.items;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.infrastructures.mysql.items.mapper")
public class ItemsConfiguration {
}