package com.spring.hospital.app.entities;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "treatments")
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "treatment_id")
    private int id;

}