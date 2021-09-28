package com.spring.hospital.app.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "doctors")
public class Doctor {
    @Id
    @Column(name = "doctor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "doctor_specialty_id")
    private DoctorSpecialty doctorSpecialty;

    @ManyToOne
    @JoinColumn(name = "doctor_category_id")
    private DoctorCategory doctorCategory;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @OneToMany(mappedBy = "doctor")
    private List <Treatment> treatments;
}
