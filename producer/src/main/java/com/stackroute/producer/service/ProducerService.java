package com.stackroute.producer.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

// this class is a service class which hold business logic
@Service
public class ProducerService {

//    Constructor based Dependency injection to inject AmqpTemplate here
    @Autowired
    private AmqpTemplate amqpTemplate;

//    injects values into fields
    @Value("${jsa.rabbitmq.exchange}")
    private String exchange;

    @Value("${jsa.rabbitmq.routingkey}")
    private String routingKey;

    public void produceMsg(String msg) {
        amqpTemplate.convertAndSend(exchange, routingKey, msg);
    }
}
