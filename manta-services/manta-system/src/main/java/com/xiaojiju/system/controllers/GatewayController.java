package com.xiaojiju.system.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/system")
public class GatewayController {

    @GetMapping("/hello")
    public String hello(String hello) {
        System.out.println(hello);
        return hello;
    }
}
