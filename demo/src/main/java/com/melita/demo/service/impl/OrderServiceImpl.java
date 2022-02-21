package com.melita.demo.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.melita.demo.dto.req.OrderSubmitReq;
import com.melita.demo.service.OrderService;
import com.melita.demo.utill.RabbitMQMessageSender;

@Service
public class OrderServiceImpl implements OrderService {
    Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    private final RabbitMQMessageSender<OrderSubmitReq> rabbitMQMessageSender;

    public OrderServiceImpl(RabbitMQMessageSender<OrderSubmitReq> rabbitMQMessageSender) {
        this.rabbitMQMessageSender = rabbitMQMessageSender;
    }

    @Override
    public String submitOrder(OrderSubmitReq req) {
        rabbitMQMessageSender.send(req);
        return "Order Placed Successfully";
    }

}
