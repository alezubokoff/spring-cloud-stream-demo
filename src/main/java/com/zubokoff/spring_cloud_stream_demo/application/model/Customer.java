package com.zubokoff.spring_cloud_stream_demo.application.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

    private String name;
    private String email;
}
