package org.example;

import cn.hutool.extra.spring.EnableSpringUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.example.applications.AdminAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.ArrayList;
import java.util.Arrays;

@EnableKnife4j
@EnableSwagger2WebMvc
@EnableSpringUtil
@SpringBootApplication(scanBasePackages = {"org.example"})
public class SpringBootApplication1 {
    @Autowired
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication1.class, args);
    }


    @Bean
    public CommandLineRunner runner() {
        return args -> {
            String[] beanDefinitionNames = context.getBeanNamesForAnnotation(Controller.class);
            ArrayList<String> strings = new ArrayList<>(Arrays.asList(beanDefinitionNames));
            for (String string : strings) {
                System.out.println("beanName = " + string);
            }

        };
    }

}