package com.codenotfound.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class PersonMessageConverter implements MessageConverter {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonMessageConverter.class);

    ObjectMapper mapper;

    public PersonMessageConverter() {
        mapper = new ObjectMapper();
    }

    @Override
    public Message toMessage(Object object, Session session) throws JMSException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Object fromMessage(Message message) throws JMSException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
