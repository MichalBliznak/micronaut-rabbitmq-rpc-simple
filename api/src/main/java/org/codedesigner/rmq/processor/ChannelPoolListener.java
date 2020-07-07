package org.codedesigner.rmq.processor;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import io.micronaut.rabbitmq.connect.ChannelInitializer;

import javax.inject.Singleton;
import java.io.IOException;

@Singleton
public class ChannelPoolListener extends ChannelInitializer {

    @Override
    public void initialize(Channel channel) throws IOException {
        channel.exchangeDeclare("micronaut", BuiltinExchangeType.DIRECT, true); // <1>

        channel.queueDeclare("text", true, false, false, null); // <2>
        channel.queueBind("text", "micronaut", "text.processor"); // <3>
    }
}
