package com.xiaojiju.auth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthTestController {

    @GetMapping("/echo")
    public String echoAuth(String auth) {
        return auth;
    }

}
