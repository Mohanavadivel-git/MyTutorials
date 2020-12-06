package com.tutorials.HelloWorldAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    HelloWorldReponse helloWorldReponse;

    @RequestMapping(value = "/api/v1/helloworld", method = RequestMethod.GET, produces = "application/json")
    public HelloWorldReponse HelloWorld(){
        helloWorldReponse.response = "helloworld";
        return helloWorldReponse;
    }
}
