package org.example;

import cn.hutool.extra.spring.EnableSpringUtil;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@EnableKnife4j
@EnableSwagger2WebMvc
@EnableSpringUtil
@SpringBootApplication(scanBasePackages = {"org.example"})
@EnableNacosConfig
public class Application {
    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }




}