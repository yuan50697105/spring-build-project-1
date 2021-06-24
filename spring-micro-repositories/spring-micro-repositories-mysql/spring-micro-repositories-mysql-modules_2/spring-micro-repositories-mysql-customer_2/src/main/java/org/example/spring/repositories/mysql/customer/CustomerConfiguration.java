package org.example.spring.repositories.mysql.customer;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.customer.mysql.mapper")
public class CustomerConfiguration {
}