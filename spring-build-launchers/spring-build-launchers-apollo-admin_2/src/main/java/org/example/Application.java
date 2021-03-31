package org.example;

import cn.hutool.extra.spring.EnableSpringUtil;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.ArrayList;
import java.util.Arrays;

@EnableKnife4j
@EnableSwagger2WebMvc
@EnableSpringUtil
@SpringBootApplication(scanBasePackages = {"org.example"})
@EnableApolloConfig
public class Application {
    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }




}