package com.zubokoff.spring_cloud_stream_demo.infrastructure.controller;

import com.zubokoff.spring_cloud_stream_demo.application.producer.CustomerProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tests")
@RequiredArgsConstructor
public class SpringCloudStreamController {

    private final CustomerProducer customerProducer;

    @GetMapping
    public String index() {
        customerProducer.send();
        return "Bem Vindo!";
    }
}
