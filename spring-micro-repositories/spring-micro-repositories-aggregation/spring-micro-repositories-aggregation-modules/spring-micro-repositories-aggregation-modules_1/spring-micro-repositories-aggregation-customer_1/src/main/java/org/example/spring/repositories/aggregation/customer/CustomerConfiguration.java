package org.example.spring.repositories.aggregation.customer;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.aggregation.customer.mapper")
public class CustomerConfiguration {
}