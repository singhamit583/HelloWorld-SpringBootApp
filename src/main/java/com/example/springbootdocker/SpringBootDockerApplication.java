package com.example.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@SpringBootApplication
public class SpringBootDockerApplication {

    // Counter to keep track of visits
    private final AtomicInteger counter = new AtomicInteger(0);

    @RequestMapping("/")
    public String home() {
        // Increment counter and return the message
        return "Hello World-" + counter.incrementAndGet();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }
}