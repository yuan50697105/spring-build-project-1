package org.example.spring.daos.postgres.patient;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.daos.postgres.patient.mapper")
public class PatientConfiguration {
}