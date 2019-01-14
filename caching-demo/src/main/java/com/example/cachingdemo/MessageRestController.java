package com.example.cachingdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageRestController {

    @Value("${message:default}")
    private String message;

    @GetMapping("/message")
    public String message() {
        return message;
    }
}
