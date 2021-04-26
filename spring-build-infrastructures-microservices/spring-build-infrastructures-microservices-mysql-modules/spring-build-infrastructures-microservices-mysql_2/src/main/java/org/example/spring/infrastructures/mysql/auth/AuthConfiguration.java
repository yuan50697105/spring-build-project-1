package org.example.spring.infrastructures.mysql.auth;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.infrastructures.mysql.auth.mapper")
public class AuthConfiguration {
}