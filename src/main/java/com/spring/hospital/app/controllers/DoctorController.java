package com.spring.hospital.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @GetMapping("/hello")
    public String helloDoctor(
        @RequestParam(value = "name", defaultValue = "Ilya") String name){
        return "hello " + name;
    }
}
