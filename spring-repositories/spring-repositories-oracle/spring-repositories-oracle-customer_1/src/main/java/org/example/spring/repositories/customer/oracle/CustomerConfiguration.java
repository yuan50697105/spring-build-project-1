package org.example.spring.repositories.customer.oracle;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.customer.oracle.mapper")
public class CustomerConfiguration {
}