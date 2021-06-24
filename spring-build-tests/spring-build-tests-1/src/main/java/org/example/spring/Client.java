package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Client {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        SpringApplication.run(Client.class, args);
    }

    @Bean
    public CommandLineRunner runner() {
        return new CommandLineRunner() {
            @Autowired
            private List<TestService> testService;
            @Autowired
            private Map<String, TestService> testServiceMap;

            @Override
            public void run(String... args) throws Exception {

                testService.stream().peek(testService1 -> System.out.println("testService1 = " + testService1)).forEach(TestService::test);
                testServiceMap.entrySet().stream().peek(entry -> System.out.println("entry = " + entry)).map(Map.Entry::getValue).forEach(TestService::test);
            }
        };
    }


}