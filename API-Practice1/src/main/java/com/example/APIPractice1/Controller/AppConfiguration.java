package com.example.APIPractice1.Controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Configuration
public class AppConfiguration {

    @Bean
    Map<String,Movie> movies(){
        return new ConcurrentHashMap<>();
    }

}
