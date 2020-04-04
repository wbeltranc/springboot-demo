package com.example.demo.config;

import com.example.demo.services.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Calculator configCalculator()
    {
        System.out.println("Creando bean calculator");
        return new Calculator();
    }

}
