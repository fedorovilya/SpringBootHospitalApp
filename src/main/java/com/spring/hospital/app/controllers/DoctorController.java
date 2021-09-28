package com.spring.hospital.app.controllers;

import com.spring.hospital.app.entities.Doctor;
import com.spring.hospital.app.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    DoctorService doctorService;

    @Autowired
    public void setDoctorService(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/hello")
    public String helloDoctor(
        @RequestParam(value = "name", defaultValue = "Ilya") String name){
        return "hello " + name;
    }

    @GetMapping("/get/{id}")
    public String getAllDoctors(@PathVariable(value = "id") Integer id){
        return doctorService.getDoctorFirstMiddleLastNameStringById(id);
    }
}
