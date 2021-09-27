package com.spring.hospital.app.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "diagnoses")
public class Diagnosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "diagnosis_id")
    private int id;

    @Column(name = "diagnosis")
    private String diagnosis;
}
