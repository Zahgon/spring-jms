package com.codenotfound.jms;

import javax.jms.Destination;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class SenderConfig {

    @Value("${activemq.broker-url}")
    private String brokerUrl;

    @Value("${destination.order}")
    private String orderDestination;

    @Value("${destination.status}")
    private String statusDestination;

    @Bean
    public ActiveMQConnectionFactory senderConnectionFactory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public CachingConnectionFactory cachingConnectionFactory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public Destination orderDestination() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public Destination statusDestination() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    public JmsTemplate orderJmsTemplate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
