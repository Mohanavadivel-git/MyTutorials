package com.tutorials.HelloWorldAPI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
public class CRMConfiguration {

    @Bean
    @Profile("NA")
    public CRMRepository getNACRMRepository(){
        return new NorthAmericaRepository();
    }

    @Bean
    @Profile("China")
    public CRMRepository getChinaCRMRepository(){
        return new ChinaRepository();
    }
}
