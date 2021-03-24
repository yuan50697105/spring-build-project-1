package org.example.plugins.message.produce.impl;

import cn.hutool.core.util.ObjectUtil;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.example.plugins.message.produce.RocketMQProduce;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class RocketMQProduceImpl<T> implements RocketMQProduce<T> {
    @Autowired
    protected RocketMQTemplate rocketMQTemplate;

    @Override
    public void convertAndSend(String destination, T t) {
        rocketMQTemplate.convertAndSend(destination, t);
    }

    @Override
    public void convertAndSend(String destination, T t, T... ts) {
        List<T> list = new ArrayList<>();
        list.add(t);
        if (ObjectUtil.isNotEmpty(ts)) {
            list.addAll(Arrays.asList(ts));
        }
        convertAndSend(destination, list);
    }

    @Override
    public void convertAndSend(String destination, Iterable<T> list) {
        rocketMQTemplate.convertAndSend(destination, list);
    }
}