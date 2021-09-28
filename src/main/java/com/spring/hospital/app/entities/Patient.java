package com.spring.hospital.app.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "birth_date")
    private Date birthday;

    @OneToMany(mappedBy = "patient")
    private List<Order> orders;

    @OneToOne(mappedBy = "patient")
    private PatientContact patientContact;

    @ManyToOne
    @JoinColumn(name = "patient_category")
    private PatientCategory patientCategory;

}