package org.example.spring.repositories.patient.mysql;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.patient.mysql.mapper")
public class PatientConfiguration {
}