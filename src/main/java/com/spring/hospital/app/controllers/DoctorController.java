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

    @GetMapping("/get")
    public String getAllDoctors(){
        StringBuilder doctorsString = new StringBuilder();
        List <Doctor> doctors = doctorService.getDoctorsByAll();
        for (Doctor doctor: doctors
             ) {
            doctorsString.append(doctor.toString() + "\n\n");
        }
        return doctorsString.toString();
    }

    //на будущее для себя: добавить DTO для классов Doctor, Patient и т.д. без связанных полей для
    //правильной работы с сущностями с помощью JSON
    @GetMapping("/get/{id}")
    public String getDoctor(@PathVariable(value = "id") Integer id){
        return doctorService.getDoctorById(id).toString();
    }

    @GetMapping("/get/{id}/name")
    public String getDoctorName(@PathVariable(value = "id") Integer id){
        return doctorService.getDoctorFirstMiddleLastNameStringById(id);
    }

    @GetMapping("/get/{id}/treatments")
    public List <Treatment> getDoctorTreatments(@PathVariable(value = "id") Integer id){
        List <Treatment> treatments = doctorService.getDoctorTreatmentsByDoctorId(id);
        return treatments;
    }

    //пока пошел более простым путем вместо DTO, отправлять буду параметрами
    @PostMapping("/add")
    public String addDoctor(
            @RequestParam(value = "id") Integer id,
            @RequestParam(value = "lastName") String lastName,
            @RequestParam(value = "firstName") String firstName,
            @RequestParam(value = "middleName") String middleName,
            @RequestParam(value = "specialty") String specialtyName,
            @RequestParam(value = "category") String categoryName)
    {
        doctorService.saveDoctorWithParams(id,lastName,firstName,middleName,specialtyName,categoryName);
        return "OK";
    }

    @PutMapping("/change/{id}")
    public String changeDoctor(
            @PathVariable(value = "id") Integer id,
            @RequestParam(value = "lastName") String lastName,
            @RequestParam(value = "firstName") String firstName,
            @RequestParam(value = "middleName") String middleName,
            @RequestParam(value = "specialty") String specialtyName,
            @RequestParam(value = "category") String categoryName){
        doctorService.editDoctorWithParams(id,lastName,firstName,middleName,specialtyName,categoryName);
        return "OK";
    }

    @DeleteMapping("/delete")
    public String deleteDoctor(@RequestParam(value = "id", defaultValue = "-1") Integer id){
        doctorService.deleteDoctorById(id);
        return "OK";
    }
}
