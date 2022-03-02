package com.xiaojiju.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MantaStyleAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MantaStyleAuthApplication.class, args);
    }

}
