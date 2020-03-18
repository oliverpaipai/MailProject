package com.qf.service.impl;

import com.qf.service.MessageService;
import com.qf.message.model.Message;
import com.qf.message.model.MessageStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "messageServiceImpl")
public class MessageServiceImpl implements MessageService {
    @Override
    @Transactional
    public void receiveMsg(Message message) {
        if (message == null){
            throw new RuntimeException("消息为空");
        }
        switch (message.getStatus()){
            case MessageStatus.INIT:
                // TODO save msg
                System.out.println("保存初始化消息");

            case MessageStatus.SENT:
                // TODO update msg status 为sent
                // TODO 发送消息到订单减库存队列，这块待同学们自己实现
                System.out.println("更新消息状态为sent");

            case MessageStatus.END:
                // TODO update msg status 为end
                break;

            default:
                throw new RuntimeException("消息状态有误");

        }
    }
}
