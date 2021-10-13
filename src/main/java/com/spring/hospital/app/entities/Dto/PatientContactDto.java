package com.spring.hospital.app.entities.Dto;

import lombok.Data;

@Data
public class PatientContactDto {
    private String phone;
    private String address;
    private String email;

    public PatientContactDto(){

    }

    public PatientContactDto(String phone, String address, String email) {
        this.phone = phone;
        this.address = address;
        this.email = email;
    }
}
