package com.spring.hospital.app.entities.Dto;

import com.spring.hospital.app.entities.PatientContact;
import lombok.Data;

import java.util.Date;

@Data
public class PatientDto {
    private Integer id;
    private String firstName, middleName, lastName;
    private Date birthDate;
    private PatientContactDto patientContactDto;

    public PatientDto(){

    }

    public PatientDto(Integer id, String firstName, String middleName, String lastName, Date birthDate, PatientContactDto patientContactDto) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.patientContactDto = patientContactDto;
    }
}
