package com.akashp.store;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("/")
    public String greet(){
        return "Hello Akash,You Successfully initialized Spring for building webapps";
    }

}
