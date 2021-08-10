package com.ismt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, SecurityAutoConfiguration.class})


public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}

