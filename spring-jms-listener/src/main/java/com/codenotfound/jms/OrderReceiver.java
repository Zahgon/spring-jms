package com.codenotfound.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderReceiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderReceiver.class);

    @Value("${destination.status1}")
    private String status1Destination;

    @Value("${destination.status2}")
    private String status2Destination;

    @Autowired
    JmsTemplate jmsTemplate;

    @JmsListener(destination = "${destination.order}", containerFactory = "orderDefaultJmsListenerContainerFactory")
    public void receiveOrder(String order) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
