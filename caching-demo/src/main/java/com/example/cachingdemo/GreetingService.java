package com.example.cachingdemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GreetingService {

    @Cacheable("greeting")
    public String greet(String name) {
        log.info("Greeting: {}", name);
        return "Hello " + name ;
    }
}
