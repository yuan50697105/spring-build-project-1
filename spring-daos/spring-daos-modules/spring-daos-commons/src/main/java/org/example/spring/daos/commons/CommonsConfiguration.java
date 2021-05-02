package org.example.spring.daos.commons;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Configuration
@EnableAsync
@EnableScheduling
public class CommonsConfiguration {
    @Bean
    public ThreadPoolExecutor executor() {
        int processors = Runtime.getRuntime().availableProcessors();
        return new ThreadPoolExecutor(processors, processors * 4, Long.MAX_VALUE, TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(processors * 100));
    }

}