package com.lxy;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Indexed;
import org.springframework.web.bind.annotation.CrossOrigin;

@Indexed
@CrossOrigin
@SpringBootApplication
@EnableDiscoveryClient

public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}