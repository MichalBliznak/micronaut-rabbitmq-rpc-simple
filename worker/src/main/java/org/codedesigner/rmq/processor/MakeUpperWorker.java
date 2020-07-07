package org.codedesigner.rmq.processor;
import io.micronaut.rabbitmq.annotation.Queue;
import io.micronaut.rabbitmq.annotation.RabbitListener;

@RabbitListener
public class MakeUpperWorker {
    @Queue("text")
    public String toUpperCase(String text) {
        return text.toUpperCase();
    }

}