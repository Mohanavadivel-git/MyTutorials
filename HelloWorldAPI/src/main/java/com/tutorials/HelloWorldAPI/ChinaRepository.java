package com.tutorials.HelloWorldAPI;

import org.springframework.beans.factory.annotation.Autowired;

public class ChinaRepository implements CRMRepository{

    @Autowired
    HelloWorldReponse helloWorldReponse;

    @Override
    public HelloWorldReponse helloworld() {
        helloWorldReponse.response = "HelloWorld from China";
        return helloWorldReponse;
    }
}
