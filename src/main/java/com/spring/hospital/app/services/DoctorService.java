package com.spring.hospital.app.services;

import com.spring.hospital.app.entities.Doctor;
import com.spring.hospital.app.entities.Dto.DoctorDto;
import com.spring.hospital.app.entities.Treatment;
import com.spring.hospital.app.repositories.DoctorCategoryRepos;
import com.spring.hospital.app.repositories.DoctorRepos;
import com.spring.hospital.app.repositories.DoctorSpecialtyRepos;
import com.spring.hospital.app.utils.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DoctorService {

    private DoctorRepos doctorRepos;
    private DoctorCategoryRepos doctorCategoryRepos;

    private DoctorSpecialtyRepos doctorSpecialtyRepos;

    @Autowired
    private MappingUtils mappingUtils;

    @Autowired
    public void setDoctorRepos(DoctorRepos doctorRepos) {
        this.doctorRepos = doctorRepos;
    }

    @Autowired
    public void setDoctorCategoryRepos(DoctorCategoryRepos doctorCategoryRepos) {
        this.doctorCategoryRepos = doctorCategoryRepos;
    }

    @Autowired
    public void setDoctorSpecialtyRepos(DoctorSpecialtyRepos doctorSpecialtyRepos) {
        this.doctorSpecialtyRepos = doctorSpecialtyRepos;
    }

    public List <DoctorDto> getDoctorsByAll(){
        return doctorRepos.findAll().stream() //стрим из листа
                .map(MappingUtils::mapToDoctorDto) //маппинг для каждого элемента
                .collect(Collectors.toList()); //превратили стрим обратно в коллекцию, а точнее в лист

    }

    public DoctorDto getDoctorById(Integer id){
        Optional<DoctorDto> doctor =
                Optional.of(mappingUtils.mapToDoctorDto(doctorRepos.getById(id)));
        return doctor.orElse(null);
    }

    //потом доделать используя Spring Data Specifications
    public List <DoctorDto> findDoctorsByParams(Integer id, String lastName, String firstName, String middleName, String specialtyName, String categoryName){
        List <DoctorDto> doctors = null;

        if (id != null) {
            doctors.add(getDoctorById(id));
            return doctors;
        }
        if (lastName != null)

        return doctors;
        return doctors;
    }

    public void saveDoctor(DoctorDto doctorDto){
        Doctor doctor;
        doctor = MappingUtils.mapToDoctorEntity(doctorDto);
        doctorRepos.save(doctor);
    }

    public void saveDoctorWithParams(Integer id, String lastName, String firstName, String middleName, String specialtyName, String categoryName){
        DoctorDto doctorDto = new DoctorDto(id, firstName, middleName, lastName, categoryName, specialtyName);
        saveDoctor(doctorDto);
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
}
