package org.example.domains.message.provider.impl;

import cn.hutool.json.JSONUtil;
import org.example.domains.message.provider.OrderMessageProvider;
import org.example.modules.repository.mysql.entity.vo.OrderFormVo;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate.ConfirmCallback;
import org.springframework.amqp.rabbit.core.RabbitTemplate.ReturnCallback;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

@Service
@Transactional
public class OrderMessageProviderImpl implements OrderMessageProvider, ConfirmCallback, ReturnCallback {
    private final RabbitTemplate rabbitTemplate;

    public OrderMessageProviderImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
        this.rabbitTemplate.setReturnCallback(this);
        this.rabbitTemplate.setConfirmCallback(this);
    }

    @Override
    public void addOrder(OrderFormVo orderInfoVo) {
        String jsonStr = JSONUtil.toJsonStr(orderInfoVo);
        byte[] bytes = jsonStr.getBytes(StandardCharsets.UTF_8);
        MessageProperties messageProperties = new MessageProperties();
        String messageId = UUID.randomUUID().toString();
        messageProperties.setMessageId(messageId);
        messageProperties.setCorrelationId(messageId);
        messageProperties.setContentLength(bytes.length);
        new Message(bytes, messageProperties);
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {

    }

    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {

    }
}