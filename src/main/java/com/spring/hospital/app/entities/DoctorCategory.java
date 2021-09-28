package com.spring.hospital.app.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "doctor_categories")
public class DoctorCategory {
    @Id
    @Column(name = "doctor_category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "doctor_category")
    private String categoryName;

    @OneToMany(mappedBy = "doctorCategory")
    private List<Doctor> doctors;
}
