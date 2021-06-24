package org.example.spring.repositories.patient.postgres;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.patient.postgres.mapper")
public class PatientConfiguration {
}