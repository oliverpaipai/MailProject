package com.qf.service.config;

import com.qf.constant.RabbitConstant;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue getQueue(){
        return new Queue(RabbitConstant.EMAIL_SEND_QUEUE);
    }

    @Bean
    public TopicExchange getExchange(){
        return new TopicExchange(RabbitConstant.EMAIL_TOPIC_EXCHANGE);
    }

    @Bean
    public Binding getBinding(Queue queue,TopicExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("Email.regist");
    }
}
