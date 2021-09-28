package com.spring.hospital.app.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "patient_categories")
public class PatientCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_category")
    private int patientCategoryId;

    @Column(name = "category_name")
    private String patientCategoryName;

    @Column(name = "discount")
    private int discount;

    @OneToMany(mappedBy = "patientCategory")
    private List<Patient> patients;
}
