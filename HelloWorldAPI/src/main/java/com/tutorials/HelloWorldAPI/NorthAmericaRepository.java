package com.tutorials.HelloWorldAPI;

import org.springframework.beans.factory.annotation.Autowired;

public class NorthAmericaRepository implements CRMRepository{
    @Autowired
    HelloWorldReponse helloWorldReponse;

    @Override
    public HelloWorldReponse helloworld() {
        helloWorldReponse.response = "HelloWorld from NorthAmerica";
        return helloWorldReponse;
    }
}
