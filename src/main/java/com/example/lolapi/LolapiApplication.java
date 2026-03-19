package com.example.lolapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@SpringBootApplication
@RestController

public class LolapiApplication {
    public static void main(String[] args) {
        SpringApplication.run(LolapiApplication.class, args);
    }
}