package org.example.plugins.message.produce;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class StringObjectKafkaTemplate extends KafkaTemplate<String, Object> {
    public StringObjectKafkaTemplate(ProducerFactory<String, Object> producerFactory) {
        super(producerFactory);
    }

    public StringObjectKafkaTemplate(ProducerFactory<String, Object> producerFactory, Map<String, Object> configOverrides) {
        super(producerFactory, configOverrides);
    }

    public StringObjectKafkaTemplate(ProducerFactory<String, Object> producerFactory, boolean autoFlush) {
        super(producerFactory, autoFlush);
    }

    public StringObjectKafkaTemplate(ProducerFactory<String, Object> producerFactory, boolean autoFlush, Map<String, Object> configOverrides) {
        super(producerFactory, autoFlush, configOverrides);
    }

}