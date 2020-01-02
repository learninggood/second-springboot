package com.example.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringbootApplication.class, args);
    }

    @RequestMapping
    public String hello() {
        return "hello third-spring-boot pro";
    }
}
