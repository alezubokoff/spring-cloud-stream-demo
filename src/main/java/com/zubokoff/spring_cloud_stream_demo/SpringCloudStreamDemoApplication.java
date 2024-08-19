package com.zubokoff.spring_cloud_stream_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
@EntityScan(basePackages = "com.zubokoff")
public class SpringCloudStreamDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamDemoApplication.class, args);
	}

}
