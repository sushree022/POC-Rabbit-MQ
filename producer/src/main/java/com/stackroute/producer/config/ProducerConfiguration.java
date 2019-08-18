package com.stackroute.producer.config;

import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//This class is a configuration class
@Configuration
public class ProducerConfiguration {
    //    Creates a bean for MessageConverter to convert text to json format
    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
