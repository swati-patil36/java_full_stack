package com.swati.spring_sec_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController 
public class HelloController {

    @GetMapping("/hello")
    public String great(HttpServletRequest request) {
        return "Hello World"+ request.getSession().getId();
    }
    
    @GetMapping("/about")
    public String about(HttpServletRequest request) {
        return "Swatss"+ request.getSession().getId();
    }
}
