package com.spring.hospital.app.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "doctor_specialties")
public class DoctorSpecialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_specialty_id")
    private int id;

    @Column(name = "doctor_specialty")
    private String specialtyName;

    @OneToMany(mappedBy = "doctorSpecialty")
    private List<Doctor> doctors;
}
