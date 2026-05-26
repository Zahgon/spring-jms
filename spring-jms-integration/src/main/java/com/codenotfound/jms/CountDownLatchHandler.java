package com.codenotfound.jms;

import java.util.concurrent.CountDownLatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;

public class CountDownLatchHandler implements MessageHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountDownLatchHandler.class);

    private CountDownLatch latch = new CountDownLatch(10);

    public CountDownLatch getLatch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void handleMessage(Message<?> message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
