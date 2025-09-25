package com.springdemo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String index() {
        return "Hello World from spring demo";
    }

    @RequestMapping("/about")
    public String about() {
        return "Hi, I'm Thirumavalavan. Learning Spring Boot!";
    }
}
