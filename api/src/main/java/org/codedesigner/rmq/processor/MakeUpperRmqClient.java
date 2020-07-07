package org.codedesigner.rmq.processor;

import io.micronaut.rabbitmq.annotation.Binding;
import io.micronaut.rabbitmq.annotation.RabbitClient;
import io.micronaut.rabbitmq.annotation.RabbitProperty;

@RabbitClient("micronaut")
@RabbitProperty(name = "replyTo", value = "amq.rabbitmq.reply-to")
public interface MakeUpperRmqClient {

    @Binding("text.processor")
    String send(String data);
}