package com.spring.hospital.app.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @Column(name = "doctor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "doctor_specialty_id")
    private int doctorSpecialtyId;

    @Column(name = "doctor_category_id")
    private int doctorCategoryId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;


}
