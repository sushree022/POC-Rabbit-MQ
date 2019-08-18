package com.stackroute.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    /**
     * @RabbitListener to consume messages from queue produced by Producer
     */
    @RabbitListener(queues = "${jsa.rabbitmq.queue}")
    public void receivedMessage(String msg) {
        System.out.println("received msg=" + msg);
    }
}
