package org.example.spring.repositories.mssql.patient;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.mssql.patient.mapper")
public class PatientConfiguration {
}