package org.example.domains.message.provider.impl;

import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import lombok.AllArgsConstructor;
import org.example.domains.message.provider.OrderMessageProvider;
import org.example.modules.repository.mysql.entity.vo.OrderInfoVo;
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
@AllArgsConstructor
public class OrderMessageProviderImpl implements OrderMessageProvider, ConfirmCallback, ReturnCallback {
    private final RabbitTemplate rabbitTemplate;

    @Override
    public void addOrder(OrderInfoVo orderInfoVo) {
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