package org.example.domains.message.configuration;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

import static org.example.domains.message.DelayQueuesConfigurationConstants.*;

/**
 * @author yuane
 */
@Configuration
public class OrderCancelDelayQueuesConfiguration {
    // 延迟队列 TTL 名称
    private static final String ORDER_DELAY_QUEUE = "order.delay.queue";

    // DLX，dead letter发送到的 exchange
    // 延时消息就是发送到该交换机的
    public static final String ORDER_DELAY_EXCHANGE = "order.delay.exchange";

    // routing key 名称
    // 具体消息发送在该 routingKey 的
    public static final String ORDER_DELAY_ROUTING_KEY = "order_delay";

    //立即消费的队列名称
    public static final String ORDER_QUEUE_NAME = "order.queue";

    // 立即消费的exchange
    public static final String ORDER_EXCHANGE_NAME = "order.exchange";

    //立即消费 routing key 名称
    public static final String ORDER_ROUTING_KEY = "order";

    /**
     * 创建一个延时队列
     */
    @Bean
    public Queue delayOrderQueue() {
        Map<String, Object> params = new HashMap<>();
        // x-dead-letter-exchange 声明了队列里的死信转发到的DLX名称，
        params.put("x-dead-letter-exchange", ORDER_EXCHANGE_NAME);
        // x-dead-letter-routing-key 声明了这些死信在转发时携带的 routing-key 名称。
        params.put("x-dead-letter-routing-key", ORDER_ROUTING_KEY);
        return new Queue(ORDER_DELAY_QUEUE, true, false, false, params);
    }

    /**
     * 创建一个立即消费队列
     */
    @Bean
    public Queue orderQueue() {
        // 第一个参数为queue的名字，第二个参数为是否支持持久化
        return new Queue(ORDER_QUEUE_NAME, true);
    }

    /**
     * 延迟交换机
     */
    @Bean
    public DirectExchange orderDelayExchange() {
        // 一共有三种构造方法，可以只传exchange的名字， 第二种，可以传exchange名字，是否支持持久化，是否可以自动删除，
        // 第三种在第二种参数上可以增加Map，Map中可以存放自定义exchange中的参数
        // new DirectExchange(ORDER_DELAY_EXCHANGE,true,false);
        return new DirectExchange(ORDER_DELAY_EXCHANGE);
    }

    /**
     * 立即消费交换机
     */
    @Bean
    public TopicExchange orderTopicExchange() {
        return new TopicExchange(ORDER_EXCHANGE_NAME);
    }

    /**
     * 把延时队列和 订单延迟交换的exchange进行绑定
     *
     * @return
     */
    @Bean
    public Binding dlxBinding() {
        return BindingBuilder.bind(delayOrderQueue()).to(orderDelayExchange()).with(ORDER_DELAY_ROUTING_KEY);
    }

    /**
     * 把立即队列和 立即交换的exchange进行绑定
     *
     * @return
     */
    @Bean
    public Binding orderBinding() {
        // TODO 如果要让延迟队列之间有关联,这里的 routingKey 和 绑定的交换机很关键
        return BindingBuilder.bind(orderQueue()).to(orderTopicExchange()).with(ORDER_ROUTING_KEY);
    }


}


