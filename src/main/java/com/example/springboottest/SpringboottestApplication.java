package com.example.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringboottestApplication {

    public static void main(String[] args) {

        SpringApplication.run (SpringboottestApplication.class, args);
        System.out.println ("hello");
    }

}
