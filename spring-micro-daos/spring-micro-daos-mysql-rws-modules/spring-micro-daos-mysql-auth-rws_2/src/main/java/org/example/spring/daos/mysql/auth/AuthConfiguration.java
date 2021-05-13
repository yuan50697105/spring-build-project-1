package org.example.spring.daos.mysql.auth;

import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@MapperScan(basePackages = "org.example.spring.daos.mysql.auth.mapper")
public class AuthConfiguration {
}