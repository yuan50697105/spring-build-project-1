package org.example.spring.repositories.mssql.bill;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan
@ComponentScan
public class BillConfiguration {
}