package com.github.travelervihaan.hogwarts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HogwartsMarketplaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HogwartsMarketplaceApplication.class, args);
    }

}
