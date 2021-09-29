package com.spring.hospital.app.controllers;

import com.spring.hospital.app.entities.Doctor;
import com.spring.hospital.app.entities.Treatment;
import com.spring.hospital.app.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    private DoctorService doctorService;

    @Autowired
    public void setDoctorService(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/hello")
    public String helloDoctor(
        @RequestParam(value = "name", defaultValue = "Ilya") String name){
        return "hello " + name;
    }

    @GetMapping("/get/{id}/name")
    public String getDoctorName(@PathVariable(value = "id") Integer id){
        return doctorService.getDoctorFirstMiddleLastNameStringById(id);
    }

    //на будущее для себя: добавить DTO для классов Doctor, Patient и т.д. без связанных полей для
    //правильной работы с сущностями с помощью JSON
    @GetMapping("/get/{id}")
    public String getDoctor(@PathVariable(value = "id") Integer id){
        return doctorService.getDoctorById(id).toString();
    }

    @GetMapping("/get/{id}/treatments")
    public List <Treatment> getDoctorTreatments(@PathVariable(value = "id") Integer id){
        List <Treatment> treatments = doctorService.getDoctorTreatmentsByDoctorId(id);
        return treatments;
    }

    /*@PostMapping("/add")
    public String addDoctor(
            @RequestParam
    )*/

    @DeleteMapping("/delete")
    public String deleteDoctor(@RequestParam(value = "id", defaultValue = "-1") Integer id){
        doctorService.deleteDoctorById(id);
        return "OK";
    }

}
