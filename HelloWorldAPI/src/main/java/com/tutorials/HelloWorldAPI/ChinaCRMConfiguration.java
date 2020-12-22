package com.tutorials.HelloWorldAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("China")
public class ChinaCRMConfiguration {
    @Bean
    public CRMRepository getChinaCRMRepository(){
        return new ChinaRepository();
    }
}
