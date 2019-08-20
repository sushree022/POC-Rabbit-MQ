package com.stackroute.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

// This class is a service class which holds business logic
@Service
public class ConsumerService {

//    This is to consume messages from queue produced by Producer

    @RabbitListener(queues = "${jsa.rabbitmq.queue}")
    public void receivedMessage(String msg) {
        System.out.println("The received message=" + msg);
    }
}
