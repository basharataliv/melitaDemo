package com.melita.demo.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melita.demo.dto.req.OrderSubmitReq;
import com.melita.demo.dto.responce.BaseResponseDto;
import com.melita.demo.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
    Logger logger = LoggerFactory.getLogger(OrderController.class);

    private final OrderService service;

    public OrderController(OrderService service) {

        this.service = service;
    }

    @PostMapping(produces = "application/json")
    public BaseResponseDto<?> delete(@Valid @RequestBody OrderSubmitReq req) {
        logger.info("Order taking api called");
        return BaseResponseDto.success(service.submitOrder(req));

    }
}