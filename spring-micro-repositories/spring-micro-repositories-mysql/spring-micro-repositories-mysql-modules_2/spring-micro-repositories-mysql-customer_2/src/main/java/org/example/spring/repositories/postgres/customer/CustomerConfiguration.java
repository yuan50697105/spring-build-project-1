package org.example.spring.repositories.postgres.customer;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.postgres.customer.mapper")
public class CustomerConfiguration {
}