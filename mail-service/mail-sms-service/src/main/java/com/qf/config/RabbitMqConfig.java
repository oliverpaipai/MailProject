package com.qf.config;

import com.qf.constant.RabbitConstant;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue getQueue(){
        return new Queue(RabbitConstant.SMS_SEND_QUEUE);
    }
    @Bean
    public TopicExchange getTopicExchange(){
        return new TopicExchange(RabbitConstant.SMS_TOPIC_EXCHANGE);
    }
    @Bean
    public Binding getBinding(Queue queue,TopicExchange exchange){
        return BindingBuilder.bind(queue).to(exchange).with("regist.sms");
    }
}
