package org.example.domains.message;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.example.domains.message.DelayQueuesConfigurationConstants.*;

/**
 * @author yuane
 */
@Configuration
public class DelayQueuesConfiguration {
    public static final String X_DEAD_LETTER_EXCHANGE = "x-dead-letter-DELAY_ORDER_EXCHANGES";
    public static final String X_DEAD_LETTER_ROUTING_KEY = "x-dead-letter-routing-key";
    public static final String X_MESSAGE_TTL = "x-message-ttl";
    private static final int QUEUE_EXPIRATION = 4000;
    public static final String DLX_BINDING = "dlxBinding";

    /**
     * 过期转发队列
     *
     * @return
     */
    @Bean(DELAY_ORDER_QUEUES_TTL)
    public Queue delayOrderQueuesTTL() {
        return QueueBuilder
                .durable(DELAY_ORDER_QUEUES_TTL)
                .withArgument(X_DEAD_LETTER_EXCHANGE, DELAY_ORDER_EXCHANGES) // DLX
                .withArgument(X_DEAD_LETTER_ROUTING_KEY, DELAY_ORDER_PROCESS_QUEUES) // dead letter携带的routing key
                .withArgument(X_MESSAGE_TTL, QUEUE_EXPIRATION) // 设置队列的过期时间
                .build();
    }

    /**
     * 死信队列，延迟队列
     *
     * @return
     */
    @Bean(DELAY_ORDER_PROCESS_QUEUES)
    Queue delayOrderQueues() {
        return QueueBuilder.durable(DELAY_ORDER_PROCESS_QUEUES)
                .build();
    }

    @Bean(DELAY_ORDER_EXCHANGES)
    public Exchange delayOrderExchanges() {
        return ExchangeBuilder.directExchange(DELAY_ORDER_EXCHANGES).build();
    }

    @Bean(DLX_BINDING)
    Binding dlxBinding(@Qualifier(DELAY_ORDER_PROCESS_QUEUES) Queue queue, @Qualifier(DELAY_ORDER_EXCHANGES) Exchange directExchange) {
        return BindingBuilder.bind(queue).to(directExchange).with(DELAY_ORDER_PROCESS_QUEUES).noargs();
    }


}