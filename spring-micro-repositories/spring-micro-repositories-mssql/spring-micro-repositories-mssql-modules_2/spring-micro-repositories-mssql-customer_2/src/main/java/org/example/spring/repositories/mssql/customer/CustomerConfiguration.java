package org.example.spring.repositories.mssql.customer;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.mssql.customer.mapper")
public class CustomerConfiguration {
}