package org.example.domains;

import org.example.domains.message.configuration.OrderCancelDelayQueuesConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({OrderCancelDelayQueuesConfiguration.class})
@ComponentScan
public class OrderDelayMessageConfiguration {
}