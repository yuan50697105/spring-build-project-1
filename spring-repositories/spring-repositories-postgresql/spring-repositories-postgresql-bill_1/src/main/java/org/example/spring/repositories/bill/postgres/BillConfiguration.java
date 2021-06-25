package org.example.spring.repositories.bill.postgres;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan
@ComponentScan
public class BillConfiguration {
}