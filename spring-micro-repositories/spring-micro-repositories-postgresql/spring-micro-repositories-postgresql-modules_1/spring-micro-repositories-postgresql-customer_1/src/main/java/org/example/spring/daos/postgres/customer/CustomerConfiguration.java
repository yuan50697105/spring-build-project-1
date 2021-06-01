package org.example.spring.daos.postgres.customer;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.daos.postgres.customer.mapper")
public class CustomerConfiguration {
}