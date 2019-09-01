package com.magoe.rabbitmq.service;

import com.magoe.rabbitmq.bean.Book;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class rabbitService {

    @RabbitListener(queues = "atguigu")
    public  void received(Book book){
        System.out.println("你收到了一本书"+book);
    }

    @RabbitListener(queues= "atguigu.news")
    public  void  receivedMsg(Message message){
        System.out.println("====主"+message.getBody());
        System.out.println("======"+message.getMessageProperties());
    }
}
