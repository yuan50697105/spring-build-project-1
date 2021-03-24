package org.example.plugins.message.produce;

public interface KafkaProduce<T> {
    void convertAndSend(String destination, T t);

    void convertAndSend(String destination, T t, T... ts);

    void convertAndSend(String destination, Iterable<T> list);
}
