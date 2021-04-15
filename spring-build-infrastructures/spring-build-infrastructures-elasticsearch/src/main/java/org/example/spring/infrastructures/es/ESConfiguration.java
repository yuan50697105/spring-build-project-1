package org.example.spring.infrastructures.es;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@ComponentScan
@EnableElasticsearchRepositories(basePackages = "org.example.spring.infrastructures.es.*.dao")
public class ESConfiguration {
}