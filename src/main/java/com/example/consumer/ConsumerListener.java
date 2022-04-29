package com.example.consumer;

import com.example.consumer.config.RabbitMqConfig;
import com.example.consumer.dto.StudentDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerListener {

    @RabbitListener(queues = RabbitMqConfig.QUEUE1)
    public void listenerQueue1(StudentDto studentDto){
        System.out.println("Mensaje cola 1: "+studentDto);
    }

    @RabbitListener(queues = RabbitMqConfig.QUEUE2)
    public void listenerQueue2(StudentDto studentDto){
        System.out.println("Mensaje cola 1: "+studentDto);
    }

    @RabbitListener(queues = RabbitMqConfig.QUEUE3)
    public void listenerQueue3(StudentDto studentDto){
        System.out.println("Mensaje cola 3: "+studentDto);
    }
}
