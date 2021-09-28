package com.spring.hospital.app.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "patient_contacts")
public class PatientContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_contact_id")
    private int contactId;

    @Column(name = "patient_phone")
    private String phone;

    @Column(name = "patient_adress")
    private String adress;

    @Column(name = "patient_email")
    private String email;

    @OneToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
}
