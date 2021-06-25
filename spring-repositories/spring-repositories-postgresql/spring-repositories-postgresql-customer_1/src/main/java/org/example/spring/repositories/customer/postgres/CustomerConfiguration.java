package org.example.spring.repositories.customer.postgres;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.customer.postgres.mapper")
public class CustomerConfiguration {
}