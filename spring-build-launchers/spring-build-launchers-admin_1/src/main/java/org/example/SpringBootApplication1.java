package org.example;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@EnableKnife4j
@EnableSwagger2WebMvc
public class SpringBootApplication1 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication1.class, args);
    }

}