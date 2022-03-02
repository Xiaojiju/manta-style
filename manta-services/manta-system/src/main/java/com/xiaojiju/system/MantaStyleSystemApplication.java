package com.xiaojiju.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MantaStyleSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MantaStyleSystemApplication.class, args);
    }

}
