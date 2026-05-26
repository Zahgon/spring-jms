package com.codenotfound.jms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.jms.JmsSendingMessageHandler;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.MessageHandler;

@Configuration
public class ProducingChannelConfig {

    @Value("${destination.integration}")
    private String integrationDestination;

    @Bean
    public DirectChannel producingChannel() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Bean
    @ServiceActivator(inputChannel = "producingChannel")
    public MessageHandler jmsMessageHandler(JmsTemplate jmsTemplate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
