package com.stackroute.producer.controller;

import com.stackroute.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//  RestController annotation is used to create Restful web services using Spring MVC
@RestController

//  RequestMapping annotation maps HTTP requests to handler methods
@RequestMapping(value = "api/v1")
public class ProducerController {
    private ProducerService producerService;

    //    Constructor based Dependency injection to inject producer Service into controller
    @Autowired
    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @RequestMapping("/send")
    public String sendMessage(@RequestParam("msg") String msg) {
        producerService.produceMsg(msg);
        return "Message Sent Successfully ";
    }

}
