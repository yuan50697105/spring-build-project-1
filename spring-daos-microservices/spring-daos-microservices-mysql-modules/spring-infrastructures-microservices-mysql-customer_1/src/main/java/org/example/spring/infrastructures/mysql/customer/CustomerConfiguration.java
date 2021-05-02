package org.example.spring.infrastructures.mysql.customer;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.infrastructures.mysql.customer.mapper")
public class CustomerConfiguration {
}