package org.example.domains.message;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DelayQueuesConfiguration.class})
@ComponentScan
public class OrderDelayMessageConfiguration {
}