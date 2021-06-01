package org.example.spring.daos.mssql.items;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.daos.mssql.items.mapper")
public class ItemsConfiguration {
}