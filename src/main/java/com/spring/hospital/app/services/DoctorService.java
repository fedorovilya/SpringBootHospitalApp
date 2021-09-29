package com.spring.hospital.app.services;

import com.spring.hospital.app.entities.Doctor;
import com.spring.hospital.app.entities.Patient;
import com.spring.hospital.app.entities.Treatment;
import com.spring.hospital.app.repositories.DoctorRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private DoctorRepos doctorRepos;

    @Autowired
    public void setDoctorRepos(DoctorRepos doctorRepos) {
        this.doctorRepos = doctorRepos;
    }

    public List <Doctor> getDoctorsByAll(){
        return doctorRepos.findAll();
    }

    public Doctor getDoctorById(Integer id){
        Optional<Doctor> doctor = Optional.of(doctorRepos.getById(id));
        return doctor.orElse(null);
    }

    public List <Treatment> getDoctorTreatmentsByDoctorId(Integer id){
        Doctor doctor = doctorRepos.getById(id);
        return doctor.getTreatments();
    }
    public void saveDoctor(Doctor doctor){
        doctorRepos.save(doctor);
    }

    public void deleteDoctorById(Integer id){
        if (doctorRepos.existsById(id))
            doctorRepos.deleteById(id);
    }

    public String getDoctorFirstMiddleLastNameStringById(Integer id){
        Doctor doctor = getDoctorById(id);
        return doctor.getLastName() + " " + doctor.getFirstName()+ " " + doctor.getMiddleName();
    }
}
