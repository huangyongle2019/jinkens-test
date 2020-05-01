package com.samuel.jinkenstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JinkensTestApplication {

    @RequestMapping("/test")
    public String helloworld(){
        return "Jinkens Test";
    }

    public static void main(String[] args) {
        SpringApplication.run(JinkensTestApplication.class, args);
    }

}
