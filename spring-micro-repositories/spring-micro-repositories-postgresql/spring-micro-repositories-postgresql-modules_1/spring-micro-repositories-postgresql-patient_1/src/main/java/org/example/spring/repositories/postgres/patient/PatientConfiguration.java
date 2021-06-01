package org.example.spring.repositories.postgres.patient;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.postgres.patient.mapper")
public class PatientConfiguration {
}