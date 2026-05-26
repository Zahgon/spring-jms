package com.codenotfound.jms;

import javax.jms.ConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.jms.ChannelPublishingJmsMessageListener;
import org.springframework.integration.jms.JmsMessageDrivenEndpoint;
import org.springframework.jms.listener.SimpleMessageListenerContainer;

@Configuration
public class ConsumingChannelConfig {

    @Value("${destination.integration}")
    private String integrationDestination;

    @Bean
    public DirectChannel consumingChannel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public JmsMessageDrivenEndpoint jmsMessageDrivenEndpoint(ConnectionFactory connectionFactory) {
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

    @Bean
    @ServiceActivator(inputChannel = "consumingChannel")
    public CountDownLatchHandler countDownLatchHandler() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
