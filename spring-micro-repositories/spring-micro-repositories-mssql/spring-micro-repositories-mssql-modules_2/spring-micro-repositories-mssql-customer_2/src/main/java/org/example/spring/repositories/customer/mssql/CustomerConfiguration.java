package org.example.spring.repositories.customer.mssql;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.customer.mssql.mapper")
public class CustomerConfiguration {
}