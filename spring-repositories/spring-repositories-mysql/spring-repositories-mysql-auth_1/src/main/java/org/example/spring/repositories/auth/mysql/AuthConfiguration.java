package org.example.spring.repositories.auth.mysql;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

@Configuration
@ComponentScan
@MapperScan
public class AuthConfiguration {
}