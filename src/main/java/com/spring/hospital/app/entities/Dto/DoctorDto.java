package com.spring.hospital.app.entities.Dto;

import lombok.Data;

@Data
public class DoctorDto {
    private Integer id;
    private String firstName,middleName,lastName;
    private String categoryName, specialtyName;

    public DoctorDto(Integer id, String firstName, String middleName, String lastName, String categoryName, String specialtyName) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.categoryName = categoryName;
        this.specialtyName = specialtyName;
    }

    public DoctorDto() {

    }
}
