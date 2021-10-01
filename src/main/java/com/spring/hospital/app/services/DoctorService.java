package com.spring.hospital.app.services;

import com.spring.hospital.app.entities.Doctor;
import com.spring.hospital.app.entities.DoctorCategory;
import com.spring.hospital.app.entities.DoctorSpecialty;
import com.spring.hospital.app.entities.Treatment;
import com.spring.hospital.app.repositories.CategoryRepos;
import com.spring.hospital.app.repositories.DoctorRepos;
import com.spring.hospital.app.repositories.SpecialtyRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private DoctorRepos doctorRepos;
    private CategoryRepos categoryRepos;
    private SpecialtyRepos specialtyRepos;

    @Autowired
    public void setDoctorRepos(DoctorRepos doctorRepos) {
        this.doctorRepos = doctorRepos;
    }

    @Autowired
    public void setCategoryRepos(CategoryRepos categoryRepos) {
        this.categoryRepos = categoryRepos;
    }

    @Autowired
    public void setSpecialtyRepos(SpecialtyRepos specialtyRepos) {
        this.specialtyRepos = specialtyRepos;
    }

    public List <Doctor> getDoctorsByAll(){
        return doctorRepos.findAll();
    }

    public Doctor getDoctorById(Integer id){
        Optional<Doctor> doctor = Optional.of(doctorRepos.getById(id));
        return doctor.orElse(null);
    }

   /* public List <Doctor> findDoctorsByParams(Integer id, String lastName, String firstName, String middleName, String specialtyName, String categoryName){
        if (id != null) doctorRepos.fi
    }*/

    public void saveDoctor(Doctor doctor){
        doctorRepos.save(doctor);
    }

    public void saveDoctorWithParams(Integer id, String lastName, String firstName, String middleName, String specialtyName, String categoryName){
        Doctor doctor = new Doctor();
        DoctorSpecialty doctorSpecialty = specialtyRepos.findBySpecialtyName(specialtyName);
        DoctorCategory doctorCategory = categoryRepos.findByCategoryName(categoryName);
        doctor.setFirstName(firstName);
        doctor.setLastName(lastName);
        doctor.setMiddleName(middleName);
        doctor.setId(id);
        doctor.setDoctorSpecialty(doctorSpecialty);
        doctor.setDoctorCategory(doctorCategory);

        doctorRepos.save(doctor);
    }

    public void editDoctorWithParams(int id, String lastName, String firstName, String middleName, String specialtyName, String categoryName){
        if(doctorRepos.existsById(id)){
            saveDoctorWithParams(id,lastName,firstName,middleName,specialtyName,categoryName);
        }
    }

    public List <Treatment> getDoctorTreatmentsByDoctorId(Integer id){
        Doctor doctor = doctorRepos.getById(id);
        List<Treatment> treatments = doctor.getTreatments();
        return treatments;
    }

    public void deleteDoctorById(Integer id){
        doctorRepos.deleteById(id);
    }

    public String getDoctorFirstMiddleLastNameStringById(Integer id){
        Doctor doctor = getDoctorById(id);
        return doctor.getLastName() + " " + doctor.getFirstName()+ " " + doctor.getMiddleName();
    }
}
