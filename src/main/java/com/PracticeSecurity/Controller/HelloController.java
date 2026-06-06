package com.PracticeSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")

    public String controller()
    {
        System.out.println("I am using git and github");
        return "Welcome to Spring boot security";

    }
}
