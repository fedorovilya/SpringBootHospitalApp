package com.spring.hospital.app.entities;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;

    @Column(name = "patient_id")
    private int patientId;

    @Column(name = "datatime")
    private Timestamp datatime;
}
