package com.example.PolindromServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PolindromServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolindromServerApplication.class, args);
    }
}
