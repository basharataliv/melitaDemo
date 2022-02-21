package com.melita.demo.utill;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQMessageSender<T> {
    Logger logger = LoggerFactory.getLogger(RabbitMQMessageSender.class);
    @Autowired
    private AmqpTemplate rabbitTemp;

    @Value("${rabbitmq.exchange}")
    private String exchange;

    @Value("${rabbitmq.routingkey}")
    private String routingkey;

    public void send(T msg) {
        rabbitTemp.convertAndSend(exchange, routingkey, msg);
        logger.info("Send msg = " + msg);

    }
}
