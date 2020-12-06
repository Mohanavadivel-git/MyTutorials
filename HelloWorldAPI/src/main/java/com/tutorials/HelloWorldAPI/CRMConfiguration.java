package com.tutorials.HelloWorldAPI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CRMConfiguration {

    @Bean
    public CRMRepository getCRMRepository(){
        return new NorthAmericaRepository();
    }
}
