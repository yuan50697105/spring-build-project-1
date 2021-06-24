package org.example.spring.repositories.patient.mssql;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.patient.mssql.mapper")
public class PatientConfiguration {
}