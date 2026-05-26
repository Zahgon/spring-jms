package com.codenotfound.jms;

import java.util.concurrent.atomic.AtomicReference;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private Destination statusDestination;

    @Autowired
    private JmsTemplate jmsTemplate;

    public String sendOrder(String orderNumber) throws JMSException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String receiveOrderStatus(String correlationId) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
