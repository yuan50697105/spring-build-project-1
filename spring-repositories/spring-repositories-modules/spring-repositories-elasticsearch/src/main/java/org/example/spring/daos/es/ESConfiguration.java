package org.example.spring.daos.es;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@ComponentScan
@EnableElasticsearchRepositories(basePackages = "org.example.spring.daos.es.*.dao")
public class ESConfiguration {
}