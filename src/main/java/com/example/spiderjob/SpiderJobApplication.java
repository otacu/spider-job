package com.example.spiderjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpiderJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiderJobApplication.class, args);
    }

}
