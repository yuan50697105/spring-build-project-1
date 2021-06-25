package org.example.spring.repositories.items.mssql;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.items.mssql.mapper")
public class ItemsConfiguration {
}