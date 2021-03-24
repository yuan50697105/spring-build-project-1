package org.example.plugins.message.produce.impl;

import cn.hutool.core.util.ObjectUtil;
import org.example.plugins.message.produce.KafkaProduce;
import org.example.plugins.message.produce.StringObjectKafkaTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class KafkaProduceImpl<T> implements KafkaProduce<T> {
    @Autowired
    protected StringObjectKafkaTemplate kafkaTemplate;

    @Override
    public void convertAndSend(String destination, T t) {
        kafkaTemplate.send(destination, t);
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
        kafkaTemplate.send(destination, list);
    }
}