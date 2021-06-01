package org.example.spring.daos.mssql.patient;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.daos.mssql.patient.mapper")
public class PatientConfiguration {
}