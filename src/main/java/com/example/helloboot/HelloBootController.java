package com.example.helloboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kameshs
 */
@RestController
public class HelloBootController {

    @GetMapping("/whereami")
    public String whereami(@Value("${message.prefix}") String prefix) {
        String resp = String.format("%s from %s", prefix, System.getenv().getOrDefault("HOSTNAME", "localhost"));
        return resp;
    }
    
    @RequestMapping("/envtest")
    public String envtest() {
        String resp = String.format("Environment Variable: %s" , System.getenv().getOrDefault("ENVTEST", "...variable empty"));
        return resp;
    }

}
