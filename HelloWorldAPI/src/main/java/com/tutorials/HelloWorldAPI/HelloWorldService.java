package com.tutorials.HelloWorldAPI;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    private final CRMRepository crmRepository;

    HelloWorldService(CRMRepository crmRepository){
        this.crmRepository = crmRepository;
    }

    public HelloWorldReponse getResponsefromRepository(){
        return crmRepository.helloworld();
    }
}
