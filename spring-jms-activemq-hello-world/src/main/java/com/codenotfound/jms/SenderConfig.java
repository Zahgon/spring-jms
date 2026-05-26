package com.codenotfound.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class SenderConfig {

    @Value("${activemq.broker-url}")
    private String brokerUrl;

    @Bean
    public ActiveMQConnectionFactory senderActiveMQConnectionFactory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public CachingConnectionFactory cachingConnectionFactory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public JmsTemplate jmsTemplate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public Sender sender() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
