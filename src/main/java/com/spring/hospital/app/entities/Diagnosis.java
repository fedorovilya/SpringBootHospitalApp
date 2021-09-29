package com.spring.hospital.app.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy = "diagnosis")
    private List <Treatment> treatments;

}
