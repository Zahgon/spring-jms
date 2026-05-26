package com.codenotfound.jms;

import java.util.concurrent.CountDownLatch;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StatusMessageListener implements MessageListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

    private String id;

    private CountDownLatch latch = new CountDownLatch(1);

    public StatusMessageListener(String id) {
        super();
        this.id = id;
    }

    @Override
    public void onMessage(Message message) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public CountDownLatch getLatch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
