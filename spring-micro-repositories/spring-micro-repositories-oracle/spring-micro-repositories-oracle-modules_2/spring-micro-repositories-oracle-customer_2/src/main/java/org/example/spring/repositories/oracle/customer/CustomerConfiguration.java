package org.example.spring.repositories.oracle.customer;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.oracle.customer.mapper")
public class CustomerConfiguration {
}