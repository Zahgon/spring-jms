package com.codenotfound.jms;

import javax.jms.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.jms.ChannelPublishingJmsMessageListener;
import org.springframework.integration.jms.JmsInboundGateway;
import org.springframework.jms.listener.SimpleMessageListenerContainer;
import org.springframework.messaging.MessageChannel;

@Configuration
@EnableIntegration
public class InboundGatewayConfig {

    @Value("${destination.order.request}")
    private String orderRequestDestination;

    @Bean
    public MessageChannel inboundOrderRequestChannel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public MessageChannel inboundOrderResponseChannel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    @ServiceActivator(inputChannel = "inboundOrderRequestChannel")
    public OrderService orderService() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public JmsInboundGateway jmsInboundGateway(ConnectionFactory connectionFactory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SimpleMessageListenerContainer simpleMessageListenerContainer(ConnectionFactory connectionFactory) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public ChannelPublishingJmsMessageListener channelPublishingJmsMessageListener() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
