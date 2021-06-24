package org.example.spring.repositories.oracle.patient;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.patient.oracle.mapper")
public class PatientConfiguration {
}