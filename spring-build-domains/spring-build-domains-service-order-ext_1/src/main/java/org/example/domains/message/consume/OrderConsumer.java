package org.example.domains.message.consume;

import cn.hutool.json.JSONUtil;
import com.rabbitmq.client.Channel;
import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.entity.vo.OrderFormVo;
import org.example.modules.repository.mysql.repository.OrderInfoTransactionRepository;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.example.domains.message.configuration.OrderCancelDelayQueuesConfiguration.ORDER_QUEUE_NAME;

@Component
@AllArgsConstructor
public class OrderConsumer {
    private final Redisson redisson;
    private final OrderInfoTransactionRepository orderInfoTransactionRepository;
    @RabbitListener(queues = {ORDER_QUEUE_NAME})
    public void cancelOrder(Message message, Channel channel) throws IOException, InterruptedException {
        String json = new String(message.getBody(), StandardCharsets.UTF_8);
        OrderFormVo orderFormVo = JSONUtil.toBean(json, OrderFormVo.class);
        String orderNo = orderFormVo.getOrderNo();
        RLock lock = redisson.getLock("lock_" + orderNo);
        RLock redLock = redisson.getRedLock(lock);
        if (redLock.tryLock()) {
            try {

            } finally {
                redLock.forceUnlock();
            }

        }
        MessageProperties messageProperties = message.getMessageProperties();
        String messageId = messageProperties.getMessageId();
        channel.basicAck(messageProperties.getDeliveryTag(), false);
    }
}