package com.codenotfound.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerEndpoint;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.listener.SimpleMessageListenerContainer;

@Configuration
@EnableJms
public class ReceiverConfig {

    @Value("${activemq.broker-url}")
    private String brokerUrl;

    @Value("${destination.status1}")
    private String status1Destination;

    @Value("${destination.status2}")
    private String status2Destination;

    @Bean
    public ActiveMQConnectionFactory receiverActiveMQConnectionFactory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public DefaultJmsListenerContainerFactory orderDefaultJmsListenerContainerFactory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SimpleJmsListenerContainerFactory orderSimpleJmsListenerContainerFactory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public DefaultMessageListenerContainer orderMessageListenerContainer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public SimpleMessageListenerContainer statusMessageListenerContainer() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
