package com.codenotfound.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

public class OrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderService.class);

    public Message<?> order(Message<?> order) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
