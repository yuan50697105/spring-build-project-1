package org.example.spring.infrastructures.mysql.patient;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.infrastructures.mysql.patient.mapper")
public class PatientConfiguration {
}