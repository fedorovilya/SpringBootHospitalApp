package com.spring.hospital.app.utils;

import com.spring.hospital.app.entities.*;
import com.spring.hospital.app.entities.Dto.DoctorDto;
import com.spring.hospital.app.entities.Dto.PatientContactDto;
import com.spring.hospital.app.entities.Dto.PatientDto;
import com.spring.hospital.app.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MappingUtils {
    @Autowired
    private static DoctorRepos doctorRepos;
    @Autowired
    private static DoctorCategoryRepos doctorCategoryRepos;
    @Autowired
    private static DoctorSpecialtyRepos doctorSpecialtyRepos;
    @Autowired
    private static PatientRepos patientRepos;
    @Autowired
    private static PatientCategoryRepos patientCategoryRepos;
    @Autowired
    private static PatientContactRepos patientContactRepos;
    @Autowired
    private static OrderRepos orderRepos;
    @Autowired
    private static TreatmentRepos treatmentRepos;

    public static DoctorDto mapToDoctorDto(Doctor entity){
        DoctorDto dto = new DoctorDto();
        dto.setId(entity.getId());

        dto.setFirstName(entity.getFirstName());
        dto.setMiddleName(entity.getMiddleName());
        dto.setLastName(entity.getLastName());

        dto.setCategoryName(entity.getDoctorCategory().getCategoryName());
        dto.setSpecialtyName(entity.getDoctorSpecialty().getSpecialtyName());
        return dto;
    }
    //из dto в entity
    public static Doctor mapToDoctorEntity(DoctorDto dto){
        Doctor entity = new Doctor();
        entity.setId(dto.getId());
        entity.setFirstName(dto.getFirstName());
        entity.setMiddleName(entity.getMiddleName());
        entity.setLastName(dto.getLastName());

        DoctorSpecialty doctorSpecialty = doctorSpecialtyRepos.findBySpecialtyName(dto.getSpecialtyName());
        DoctorCategory doctorCategory = doctorCategoryRepos.findByCategoryName(dto.getCategoryName());

        entity.setDoctorSpecialty(doctorSpecialty);
        entity.setDoctorCategory(doctorCategory);
        return entity;
    }

    private static PatientDto mapToPatientDto(Patient entity){
        PatientDto dto = new PatientDto();
        dto.setId(entity.getId());
        dto.setBirthDate(entity.getBirthday());

        dto.setFirstName(entity.getFirstName());
        dto.setMiddleName(entity.getMiddleName());
        dto.setLastName(entity.getLastName());

        PatientContactDto patientContactDto =
                new PatientContactDto(entity.getPatientContact().getPhone(),
                        entity.getPatientContact().getAddress(),
                        entity.getPatientContact().getEmail());
        dto.setPatientContactDto(patientContactDto);
        return dto;
    }
}
