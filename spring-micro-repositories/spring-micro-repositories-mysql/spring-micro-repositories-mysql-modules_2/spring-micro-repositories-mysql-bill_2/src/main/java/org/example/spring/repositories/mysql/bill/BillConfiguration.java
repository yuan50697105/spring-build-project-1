package org.example.spring.repositories.mysql.bill;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan
@ComponentScan
public class BillConfiguration {
}