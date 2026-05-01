package com.meet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @GetMapping("/get")
    public String getMessage(){
        return "Hello world";
    }
}
