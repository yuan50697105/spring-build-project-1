package org.example.spring.repositories.patient;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.repositories.patient.mapper")
public class PatientConfiguration {
}