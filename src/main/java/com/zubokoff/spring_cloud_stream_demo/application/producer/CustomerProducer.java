package com.zubokoff.spring_cloud_stream_demo.application.producer;

import com.zubokoff.spring_cloud_stream_demo.application.model.Customer;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.Map;

import static org.springframework.messaging.support.MessageBuilder.withPayload;


@Component
public class CustomerProducer {
    private final StreamBridge streamBridge;

    public CustomerProducer(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    public void send() {
        Customer c = new Customer();
        c.setName("Alexandre");
        c.setEmail("alexandre@email.com");
        Message<Customer> message = withPayload(c)
                .copyHeadersIfAbsent(Map.of("event", "producer"))
                .build();
        streamBridge.send("customer-inbound", c);
        streamBridge.send("customer-outbound", message);
    }
}
