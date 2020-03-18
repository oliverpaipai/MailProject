package com.qf.handler;

import com.qf.constant.RabbitConstant;
import com.qf.constant.RedisConstant;

import com.qf.util.Sendsms;

import com.qf.util.StringUtil;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Component
public class SMSHandler {


    @Autowired
    private RedisTemplate redisTemplate;

    @RabbitListener(queues = RabbitConstant.SMS_SEND_QUEUE)
    public void proccess(String phone) throws IOException {
        //1.发送短信


        int code = Sendsms.SmS(phone);
        System.out.println(code+"ddddddddddddddddddddddddddddddddddd");


        //2.组织键值对，存入到redis中
        String redisKey = StringUtil.getRedisKey(RedisConstant.REGISTER_PHONE, phone);
        //设置键值对和有效期
        redisTemplate.opsForValue().set(redisKey,code,60, TimeUnit.MINUTES);

    }
}
