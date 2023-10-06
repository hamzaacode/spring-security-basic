package com.example.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

@GetMapping("welcome") 
    public String welcome(){
        return "Welcome to spring security test project";
    }
}
