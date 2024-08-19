package com.zubokoff.spring_cloud_stream_demo.infrastructure.consumer;


import com.zubokoff.spring_cloud_stream_demo.application.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component("input")
@Slf4j
public class CustomerConsumer implements Consumer<Message<Customer>> {
    @Override
    public void accept(Message<Customer> payload) {
        log.info("Mensagem => Nome: {}, Email: {}", payload.getPayload().getName(), payload.getPayload().getEmail());

        System.out.println("Name: " +
                payload.getPayload().getName() +
                ", Email: " + payload.getPayload().getEmail());
        System.out.println(payload.getHeaders());
    }
}
